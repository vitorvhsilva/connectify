package br.com.connectify.users.adapters.out

import br.com.connectify.users.adapters.`in`.controller.events.CreatePostDTO
import br.com.connectify.users.application.ports.out.SendCreatePostMessageOutputPort
import io.awspring.cloud.sqs.operations.SqsTemplate
import io.github.oshai.kotlinlogging.KLogger
import org.springframework.beans.factory.annotation.Value

class SendCreatePostMessageAdapter(
    @Value("\${vitorvhsilva.aws.sqs.queue.url}") val url: String,
    val sqsTemplate: SqsTemplate,
    val logger: KLogger
): SendCreatePostMessageOutputPort {
    override fun send(userId: String, postText: String) {
        sqsTemplate.send(url, CreatePostDTO(userId, postText))
        logger.info{"Mensagem de criação de post do usuário de id:${userId} foi enviado!"}
    }
}