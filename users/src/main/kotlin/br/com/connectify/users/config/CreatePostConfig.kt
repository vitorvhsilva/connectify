package br.com.connectify.users.config

import br.com.connectify.users.application.core.usecase.CreatePostUseCase
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort
import br.com.connectify.users.application.ports.out.SendCreatePostMessageOutputPort
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class CreatePostConfig(
    val getUserByIdOutputPort: GetUserByIdOutputPort,
    val sendCreatePostMessageOutputPort: SendCreatePostMessageOutputPort,
) {
    @Bean
    fun createPostUseCase(): CreatePostUseCase {
        return CreatePostUseCase(getUserByIdOutputPort, sendCreatePostMessageOutputPort)
    }
}