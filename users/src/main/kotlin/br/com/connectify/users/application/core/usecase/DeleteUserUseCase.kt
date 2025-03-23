package br.com.connectify.users.application.core.usecase

import br.com.connectify.users.application.ports.`in`.DeleteUserInputPort
import br.com.connectify.users.application.ports.out.DeleteUserOutputPort
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort

class DeleteUserUseCase(
    val getUserById: GetUserByIdOutputPort,
    val deleteUser: DeleteUserOutputPort
): DeleteUserInputPort {
    override fun delete(id: String) {
        getUserById.get(id)
        deleteUser.delete(id)
    }
}