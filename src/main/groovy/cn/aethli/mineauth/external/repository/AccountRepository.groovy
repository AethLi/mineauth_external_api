package cn.aethli.mineauth.external.repository

import cn.aethli.mineauth.external.entity.Account
import cn.aethli.mineauth.external.model.AccountRest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository

@Repository
@RepositoryRestResource(path = "account", excerptProjection = AccountRest.class)
interface AccountRepository extends JpaRepository<Account, String>, JpaSpecificationExecutor<Account> {

    @Query
    Account getById(@Param(value = "id") String id)

}
