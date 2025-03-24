package br.com.connectify.users.adapters.out

import br.com.connectify.users.adapters.out.repository.UserRepository
import br.com.connectify.users.adapters.out.repository.mapper.UserEntityMapper
import br.com.connectify.users.application.core.domain.User
import br.com.connectify.users.application.ports.out.UpdateUserOutputPort
import org.springframework.cache.annotation.CachePut
import org.springframework.stereotype.Component

@Component
class UpdateUserAdapter(
    val userRepository: UserRepository,
    val mapper: UserEntityMapper
): UpdateUserOutputPort {
    @CachePut(value = ["users"], key = "#updatedUser.userId")
    override fun update(updatedUser: User): User {
        val user = userRepository.save(mapper.toEntity(updatedUser))
        return mapper.fromEntity(user)
    }
}