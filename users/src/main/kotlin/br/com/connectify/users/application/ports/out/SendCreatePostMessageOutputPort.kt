package br.com.connectify.users.application.ports.out

interface SendCreatePostMessageOutputPort {
    fun send(userId: String, postText: String)
}