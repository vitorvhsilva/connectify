package br.com.connectify.users.application.core.usecase

import br.com.connectify.users.application.core.domain.User
import br.com.connectify.users.application.ports.`in`.UpdateUserInputPort
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort
import br.com.connectify.users.application.ports.out.UpdateUserOutputPort
import br.com.connectify.users.application.ports.out.VerifyUsernameOutputPort

class UpdateUserUseCase(
    val updateUser: UpdateUserOutputPort,
    val verifyUsername: VerifyUsernameOutputPort,
    val getUserById: GetUserByIdOutputPort
): UpdateUserInputPort {
    override fun update(updatedUser: User): User {
        getUserById.get(updatedUser.userId!!) // verificar se o usuario existe no banco de dados
        verifyUsername.verify(updatedUser.username)
        return updateUser.update(updatedUser)
    }
}