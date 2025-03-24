package br.com.connectify.users.config

import br.com.connectify.users.application.core.usecase.FollowUserUseCase
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort
import br.com.connectify.users.application.ports.out.UpdateUserOutputPort
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class FollowUserConfig(
    val getUserByIdOutputPort: GetUserByIdOutputPort,
    val updateUserOutputPort: UpdateUserOutputPort
) {
    @Bean
    fun followUserUseCase(): FollowUserUseCase {
        return FollowUserUseCase(getUserByIdOutputPort, updateUserOutputPort)
    }
}