package br.com.connectify.users.application.ports.out

interface VerifyUsernameOutputPort {
    fun verify(username: String)
}