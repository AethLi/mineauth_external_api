package cn.aethli.mineauth.external.controller

import cn.aethli.mineauth.external.entity.Account
import cn.aethli.mineauth.external.service.AccountService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

import javax.validation.Valid

@RestControllerAdvice
@RequestMapping("api/account")
class AccountController {
    @Autowired
    AccountService accountService

    @GetMapping("getById")
    Account getById(@RequestParam("id") String id) {
        accountService.getById(id)
    }

    @PostMapping("saveOne")
    ResponseEntity saveOne(@RequestBody @Valid Account account) {
        accountService.saveOne(account)
    }

}
