package br.com.connectify.users.application.core.usecase

import br.com.connectify.users.application.ports.`in`.CreatePostInputPort
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort
import br.com.connectify.users.application.ports.out.SendCreatePostMessageOutputPort

class CreatePostUseCase(
    val getUserById: GetUserByIdOutputPort,
    val sendMessage: SendCreatePostMessageOutputPort
): CreatePostInputPort {
    override fun create(userId: String, postText: String) {
        getUserById.get(userId) // valida se o usuario existe no banco de dados
        sendMessage.send(userId, postText)
    }
}