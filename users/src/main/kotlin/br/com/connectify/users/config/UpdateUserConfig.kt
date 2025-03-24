package br.com.connectify.users.config

import br.com.connectify.users.application.core.usecase.UpdateUserUseCase
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort
import br.com.connectify.users.application.ports.out.UpdateUserOutputPort
import br.com.connectify.users.application.ports.out.VerifyUsernameOutputPort
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class UpdateUserConfig(
    val updateUserOutputPort: UpdateUserOutputPort,
    val verifyUsernameOutputPort: VerifyUsernameOutputPort,
    val getUserByIdOutputPort: GetUserByIdOutputPort
) {
    @Bean
    fun updateUserUseCase(): UpdateUserUseCase {
        return UpdateUserUseCase(updateUserOutputPort, verifyUsernameOutputPort, getUserByIdOutputPort)
    }
}