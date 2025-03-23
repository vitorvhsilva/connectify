package br.com.connectify.users.application.core.domain

import java.time.LocalDate

data class User(
    val userId: String? = "",
    val firstName: String,
    val lastName: String,
    val username: String,
    val email: String,
    val password: String,
    val description: String? = "",
    val following: List<User>? = emptyList(),
    val followers: List<User>? = emptyList(),
    val birthDate: LocalDate,
    var accountCreationDate: LocalDate? = null,
    val gender: Gender
) {
    fun followUser(user: User): User {
        val updatedFollowing = following?.plus(user) ?: listOf(user)
        return this.copy(following = updatedFollowing)
    }

    fun addFollower(user: User): User {
        val updatedFollowers = followers?.plus(user) ?: listOf(user)
        return this.copy(followers = updatedFollowers)
    }
}
