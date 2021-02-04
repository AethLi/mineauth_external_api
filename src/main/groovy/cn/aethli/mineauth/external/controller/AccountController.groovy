package cn.aethli.mineauth.external.controller

import cn.aethli.mineauth.external.entity.Account
import cn.aethli.mineauth.external.service.AccountService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
@RequestMapping("api/account")
class AccountController {
    @Autowired
    AccountService accountService
    @Autowired
    ObjectMapper defaultMapper;

    @GetMapping("getById")
    Account getById(@RequestParam("id") String id) {
        return accountService.getById(id)
    }

}
