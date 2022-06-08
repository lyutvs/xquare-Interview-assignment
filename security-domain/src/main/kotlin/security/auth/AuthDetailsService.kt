package security.auth

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Component
import user.adpter.out.UserRepository

@Component
class AuthDetailsService(

    private val userRepository: UserRepository

) : UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        val user = userRepository.findByAccountId(username)
        return AuthDetails(user = user)
    }
}
