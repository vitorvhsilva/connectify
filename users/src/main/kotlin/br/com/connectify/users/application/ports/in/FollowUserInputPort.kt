package br.com.connectify.users.application.ports.`in`

import br.com.connectify.users.application.core.domain.User

interface FollowUserInputPort {
    fun follow(userId: String, followerId: String): User
}