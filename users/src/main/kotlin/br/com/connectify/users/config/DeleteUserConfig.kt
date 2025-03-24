package br.com.connectify.users.config

import br.com.connectify.users.application.core.usecase.DeleteUserUseCase
import br.com.connectify.users.application.core.usecase.UpdateUserUseCase
import br.com.connectify.users.application.ports.out.DeleteUserOutputPort
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort
import br.com.connectify.users.application.ports.out.UpdateUserOutputPort
import br.com.connectify.users.application.ports.out.VerifyUsernameOutputPort
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class DeleteUserConfig(
    val getUserByIdOutputPort: GetUserByIdOutputPort,
    val deleteUserOutputPort: DeleteUserOutputPort
) {
    @Bean
    fun deleteUserUseCase(): DeleteUserUseCase {
        return DeleteUserUseCase(getUserByIdOutputPort, deleteUserOutputPort)
    }
}