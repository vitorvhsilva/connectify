package br.com.connectify.users.adapters.`in`.controller.dto

import br.com.connectify.users.application.core.domain.Gender
import br.com.connectify.users.application.core.domain.User
import java.time.LocalDate

data class CreateUserOutputDTO(
    val userId: String,
    val firstName: String,
    val lastName: String,
    val username: String,
    val email: String,
    val password: String,
    val description: String,
    val following: List<User>,
    val followers: List<User>,
    val birthDate: LocalDate,
    var accountCreationDate: LocalDate,
    val gender: Gender
)
