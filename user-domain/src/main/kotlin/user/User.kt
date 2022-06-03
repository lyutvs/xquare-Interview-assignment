package user

import annotations.Aggregate
import user.type.Authority
import java.util.*

@Aggregate
class User(

    val id: UUID = UUID.randomUUID(),

    val accountId: String,

    val password: String

) {

    var authority = Authority.USER
        private set

}