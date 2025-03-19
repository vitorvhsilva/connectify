package br.com.connectify.users.application.ports.out

import br.com.connectify.users.application.core.domain.User

interface PersistUserOutputPort {
    fun persist(user: User): User
}