package cn.aethli.mineauth.external.service

import cn.aethli.mineauth.external.entity.Account
import org.springframework.http.ResponseEntity

interface AccountService {

    Account getById(String id)

    ResponseEntity saveOne(Account account)
}