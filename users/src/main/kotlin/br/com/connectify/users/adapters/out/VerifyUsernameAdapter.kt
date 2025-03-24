package br.com.connectify.users.adapters.out

import br.com.connectify.users.adapters.exception.UsernameAlreadyExistsException
import br.com.connectify.users.adapters.out.repository.UserRepository
import br.com.connectify.users.application.ports.out.VerifyUsernameOutputPort
import org.springframework.stereotype.Component

@Component
class VerifyUsernameAdapter(
    val userRepository: UserRepository
): VerifyUsernameOutputPort {
    override fun verify(username: String) {
        if (userRepository.existsByUsername(username)) throw UsernameAlreadyExistsException()
    }
}