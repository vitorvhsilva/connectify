package br.com.connectify.users.application.core.usecase

import br.com.connectify.users.application.core.domain.User
import br.com.connectify.users.application.ports.`in`.FollowUserInputPort
import br.com.connectify.users.application.ports.out.GetUserByIdOutputPort
import br.com.connectify.users.application.ports.out.UpdateUserOutputPort

class FollowUserUseCase(
    val getUserById: GetUserByIdOutputPort,
    val updateUser: UpdateUserOutputPort
): FollowUserInputPort {
    override fun follow(userId: String, followerId: String): User {
        val user = getUserById.get(userId)
        val followerUser = getUserById.get(followerId)

        val updatedFollowerUser = followerUser.followUser(user)
        val updatedUser = user.addFollower(followerUser)

        updateUser.update(updatedFollowerUser)
        return updateUser.update(updatedUser)
    }
}