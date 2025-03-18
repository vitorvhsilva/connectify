package br.com.connectify.posts

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PostsApplication

fun main(args: Array<String>) {
	runApplication<PostsApplication>(*args)
}
