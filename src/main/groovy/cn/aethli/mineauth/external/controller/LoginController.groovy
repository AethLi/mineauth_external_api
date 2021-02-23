package cn.aethli.mineauth.external.controller

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * @author 93162* */
@ControllerAdvice
@RequestMapping("login")
class LoginController {
    @PostMapping(consumes = ['application/json', 'application/x-www-form-urlencoded'])
    ModelAndView post() {
        ModelAndView modelAndView = new ModelAndView()
        modelAndView.setViewName("redirect:/main.html")
        modelAndView
    }
}
