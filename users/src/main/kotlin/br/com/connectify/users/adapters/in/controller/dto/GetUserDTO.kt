package br.com.connectify.users.adapters.`in`.controller.dto

import br.com.connectify.users.application.core.domain.Gender
import br.com.connectify.users.application.core.domain.User
import java.time.LocalDate

data class GetUserDTO (
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
)