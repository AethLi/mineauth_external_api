package cn.aethli.mineauth.external.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

import javax.validation.ConstraintViolation
import javax.validation.ConstraintViolationException
import java.util.function.Function
import java.util.stream.Collectors

/** @author aethli */
@RestControllerAdvice
class GlobeExceptionController {
    private static final Logger log = LoggerFactory.getLogger(GlobeExceptionController.class)

    @ExceptionHandler(value = Exception.class)
    ResponseEntity exceptionCatch(Exception e) {
        log.error(e.toString(), e)
        new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR)
    }

    @ExceptionHandler([MethodArgumentNotValidException.class, ConstraintViolationException.class])
    ResponseEntity<String> bindException(Exception e) {
        if (e instanceof MethodArgumentNotValidException) {
            new ResponseEntity<String>((((MethodArgumentNotValidException) e)
                    .getBindingResult().getFieldErrors().stream()
                    .map({ it.getField()+it.getDefaultMessage() } as Function)
                    .collect(Collectors.joining(","))), HttpStatus.INTERNAL_SERVER_ERROR)
        } else if (e instanceof ConstraintViolationException) {
            List<String> msgList = new ArrayList<>()
            for (ConstraintViolation<?> constraintViolation : ((ConstraintViolationException) e).getConstraintViolations()) {
                msgList.add(constraintViolation.getMessage())
            }
            new ResponseEntity<String>(Arrays.toString(msgList.toArray()), HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}
