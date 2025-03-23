package br.com.connectify.users.application.ports.out

import br.com.connectify.users.application.core.domain.User

interface GetUserByIdOutputPort {
    fun get(id: String): User
}