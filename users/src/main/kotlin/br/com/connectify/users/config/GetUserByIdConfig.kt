package br.com.connectify.users.config

import br.com.connectify.users.application.core.usecase.GetUserByIdUseCase
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class GetUserByIdConfig(
    val getUserByIdOutputPort: GetUserByIdOutputPort
) {
    @Bean
    fun getUserByIdUseCase(): GetUserByIdUseCase {
        return GetUserByIdUseCase(getUserByIdOutputPort)
    }
}