package br.com.connectify.users.adapters.out

import br.com.connectify.users.adapters.exception.EntityNotFoundException
import br.com.connectify.users.adapters.out.repository.UserRepository
import br.com.connectify.users.adapters.out.repository.mapper.UserEntityMapper
import br.com.connectify.users.application.core.domain.User
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort

class GetUserByIdAdapter(
    val userRepository: UserRepository,
    val mapper: UserEntityMapper
): GetUserByIdOutputPort {
    override fun get(id: String): User {
        val userEntity = userRepository.findById(id).orElseThrow({EntityNotFoundException()})
        return mapper.fromEntity(userEntity)
    }
}