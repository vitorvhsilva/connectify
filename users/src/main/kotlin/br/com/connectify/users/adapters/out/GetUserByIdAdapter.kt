package br.com.connectify.users.adapters.out

import br.com.connectify.users.adapters.exception.EntityNotFoundException
import br.com.connectify.users.adapters.out.repository.UserRepository
import br.com.connectify.users.adapters.out.repository.mapper.UserEntityMapper
import br.com.connectify.users.application.core.domain.User
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Component

@Component
class GetUserByIdAdapter(
    val userRepository: UserRepository,
    val mapper: UserEntityMapper
): GetUserByIdOutputPort {
    @Cacheable(value = ["users"], key = "#id")
    override fun get(id: String): User {
        val userEntity = userRepository.findById(id).orElseThrow({EntityNotFoundException()})
        return mapper.fromEntity(userEntity)
    }
}