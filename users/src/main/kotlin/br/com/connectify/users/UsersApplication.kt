package br.com.connectify.users

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class UsersApplication

fun main(args: Array<String>) {
	runApplication<UsersApplication>(*args)
}
