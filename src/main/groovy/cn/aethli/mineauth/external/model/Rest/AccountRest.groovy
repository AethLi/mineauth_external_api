package cn.aethli.mineauth.external.model.Rest

import cn.aethli.mineauth.external.entity.Account
import org.springframework.data.rest.core.config.Projection

import java.time.LocalDateTime

@Projection(
        name = "AccountRest",
        types = [Account.class])
interface AccountRest {

    String getUuid();

    String getUserName();

    LocalDateTime getLastLogin()

    Boolean getBanned()

    String getIdentifier()

    String getIp()

    Boolean getForget()

    String getIpv6()
}
