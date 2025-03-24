package br.com.connectify.users.config

import io.github.oshai.kotlinlogging.KLogger
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class LoggerConfig {
    @Bean
    fun KLogger(): KLogger {
        return KotlinLogging.logger {}
    }
}