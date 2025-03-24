package br.com.connectify.users.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.sqs.SqsAsyncClient
import java.net.URI

@Component
class SQSClient(
    @Value("\${vitorvhsilva.localstack.url}") val url: String
) {
    @Bean
    fun sqsClient(): SqsAsyncClient {
        return SqsAsyncClient.builder()
            .endpointOverride(URI.create(url))
            .region(Region.US_EAST_1)
            .build()
    }
}