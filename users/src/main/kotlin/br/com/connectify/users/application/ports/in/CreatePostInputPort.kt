package br.com.connectify.users.application.ports.`in`

interface CreatePostInputPort {
    fun create(userId: String, postText: String)
}