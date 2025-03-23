package br.com.connectify.users.adapters.`in`.controller.mapper

import br.com.connectify.users.adapters.`in`.controller.dto.*
import br.com.connectify.users.application.core.domain.User
import org.springframework.stereotype.Component

@Component
class UserControllerMapper {
    fun createInputToEntity(dto: CreateUserInputDTO): User {
        return User(
            firstName = dto.firstName,
            lastName = dto.lastName,
            username = dto.username,
            email = dto.email,
            password = dto.password,
            gender = dto.gender,
            birthDate = dto.birthDate
        )
    }

    fun entityToCreateOutput(user: User): CreateUserOutputDTO {
        return CreateUserOutputDTO(
            userId = user.userId!!,
            firstName = user.firstName,
            lastName = user.lastName,
            username= user.username,
            email = user.email,
            password = user.password,
            description = user.description!!,
            following = user.following!!,
            followers = user.followers!!,
            birthDate = user.birthDate,
            accountCreationDate = user.accountCreationDate!!,
            gender = user.gender
        )
    }

    fun entityToGetUser(user: User): GetUserDTO {
        return GetUserDTO(
            userId = user.userId!!,
            firstName = user.firstName,
            lastName = user.lastName,
            username= user.username,
            email = user.email,
            password = user.password,
            description = user.description!!,
            following = user.following!!,
            followers = user.followers!!,
            birthDate = user.birthDate,
            accountCreationDate = user.accountCreationDate!!,
            gender = user.gender
        )
    }

    fun updateUserToEntity(dto: UpdateUserDTO): User {
        return User(
            userId = dto.userId,
            firstName = dto.firstName,
            lastName = dto.lastName,
            username = dto.username,
            description = dto.description,
            email = "",
            password = dto.password,
            birthDate = dto.birthDate,
            gender = dto.gender
        )
    }

    fun entityToUserFollowers(user: User): UserFollowersDTO {
        return UserFollowersDTO(
            userId = user.userId,
            followers = user.followers?.map{
                SimplifiedFollowersDTO(it.userId, it.username)
            } ?: emptyList()
        )
    }
}