package cn.aethli.mineauth.external.service

import cn.aethli.mineauth.external.entity.Account

interface AccountService {

    Account getById(String id)
}