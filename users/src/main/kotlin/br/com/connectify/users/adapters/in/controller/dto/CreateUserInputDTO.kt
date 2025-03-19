package br.com.connectify.users.adapters.`in`.controller.dto

import br.com.connectify.users.application.core.domain.Gender
import java.time.LocalDate

data class CreateUserInputDTO(
    val firstName: String,
    val lastName: String,
    val username: String,
    val email: String,
    val password: String,
    val birthDate: LocalDate,
    val gender: Gender
)
