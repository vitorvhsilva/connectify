package br.com.connectify.users.adapters.out.repository.mapper

import br.com.connectify.users.adapters.out.repository.entity.UserEntity
import br.com.connectify.users.application.core.domain.User

class UserEntityMapper {
    fun toEntity(user: User): UserEntity {
        return UserEntity(
            userId = user.userId!!,
            firstName = user.firstName,
            lastName = user.lastName,
            username= user.username,
            email = user.email,
            password = user.password,
            description = user.description!!,
            following = user.following?.map { u -> toEntity(u) } ?: emptyList(),
            followers = user.followers?.map { u -> toEntity(u) } ?: emptyList(),
            birthDate = user.birthDate,
            accountCreationDate = user.accountCreationDate!!,
            gender = user.gender
        )
    }

    fun fromEntity(user: UserEntity): User {
        return User(
            userId = user.userId,
            firstName = user.firstName,
            lastName = user.lastName,
            username= user.username,
            email = user.email,
            password = user.password,
            description = user.description,
            following = user.following.map { u -> fromEntity(u) } ?: emptyList(),
            followers = user.followers.map { u -> fromEntity(u) } ?: emptyList(),
            birthDate = user.birthDate,
            accountCreationDate = user.accountCreationDate,
            gender = user.gender
        )
    }
}