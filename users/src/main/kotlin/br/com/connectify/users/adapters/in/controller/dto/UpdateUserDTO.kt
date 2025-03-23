package br.com.connectify.users.adapters.`in`.controller.dto

import br.com.connectify.users.application.core.domain.Gender
import java.time.LocalDate

data class UpdateUserDTO(
    val userId: String,
    val firstName: String,
    val lastName: String,
    val username: String,
    val password: String,
    val description: String,
    val birthDate: LocalDate,
    val gender: Gender
)
