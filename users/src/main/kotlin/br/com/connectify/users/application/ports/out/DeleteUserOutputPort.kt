package br.com.connectify.users.application.ports.out

interface DeleteUserOutputPort {
    fun delete(id: String)
}