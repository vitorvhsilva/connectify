package br.com.connectify.users.application.ports.`in`

import br.com.connectify.users.application.core.domain.User

interface PersistUserInputPort{
    fun persist(user: User) : User
}
