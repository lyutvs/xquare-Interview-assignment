package user.adpter.out

import user.entity.UserEntity
import java.util.*

interface UserRepository {

    fun findByAccountId(account: String) : UserEntity

}