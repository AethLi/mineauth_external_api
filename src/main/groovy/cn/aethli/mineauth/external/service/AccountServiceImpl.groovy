package cn.aethli.mineauth.external.service

import cn.aethli.mineauth.external.entity.Account
import cn.aethli.mineauth.external.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository

    @Override
    Account getById(String id) {
        accountRepository.getById(id)
    }

    @Override
    ResponseEntity saveOne(Account account) {
        ResponseEntity.ok(accountRepository.save(account))
    }
}
