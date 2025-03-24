package br.com.connectify.users.adapters.out

import br.com.connectify.users.adapters.out.repository.UserRepository
import br.com.connectify.users.adapters.out.repository.mapper.UserEntityMapper
import br.com.connectify.users.application.core.domain.User
import br.com.connectify.users.application.ports.out.PersistUserOutputPort
import org.springframework.stereotype.Component

@Component
class PersistUserAdapter(
    val repository: UserRepository,
    val mapper: UserEntityMapper
): PersistUserOutputPort {
    override fun persist(user: User): User {
        return mapper.fromEntity(repository.save(mapper.toEntity(user)))
    }
}