package br.com.connectify.users.application.core.usecase

import br.com.connectify.users.application.core.domain.User
import br.com.connectify.users.application.ports.`in`.PersistUserInputPort
import br.com.connectify.users.application.ports.out.PersistUserOutputPort
import java.time.LocalDate

class PersistUserUseCase (
    private val persistUser: PersistUserOutputPort
): PersistUserInputPort {
    override fun persist(user: User) : User {
        user.accountCreationDate = LocalDate.now()
        val persistedUser = persistUser.persist(user)
        return persistedUser
    }

}