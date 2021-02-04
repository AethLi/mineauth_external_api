package cn.aethli.mineauth.external.service

import cn.aethli.mineauth.external.entity.Account
import cn.aethli.mineauth.external.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository

    @Override
    Account getById(String id) {
        return accountRepository.getById(id)
    }
}
