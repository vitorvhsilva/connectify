package br.com.connectify.users.config

import br.com.connectify.users.application.core.usecase.PersistUserUseCase
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort
import br.com.connectify.users.application.ports.out.PersistUserOutputPort
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class PersistUserConfig(
    val persistUserOutputPort: PersistUserOutputPort
) {
    @Bean
    fun persistUserUseCase(): PersistUserUseCase {
        return PersistUserUseCase(persistUserOutputPort)
    }
}