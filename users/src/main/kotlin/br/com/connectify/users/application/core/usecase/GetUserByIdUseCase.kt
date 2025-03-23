package br.com.connectify.users.application.core.usecase

import br.com.connectify.users.application.core.domain.User
import br.com.connectify.users.application.ports.`in`.GetUserByIdInputPort
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort

class GetUserByIdUseCase(
    val getUser: GetUserByIdOutputPort
): GetUserByIdInputPort {
    override fun get(id: String): User {
        val user = getUser.get(id)
        return user
    }
}