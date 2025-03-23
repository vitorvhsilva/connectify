package br.com.connectify.users.application.ports.`in`

import br.com.connectify.users.application.core.domain.User

interface GetUserByIdInputPort {
    fun get(id: String): User
}