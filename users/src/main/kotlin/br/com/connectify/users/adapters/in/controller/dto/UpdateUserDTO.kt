package br.com.connectify.users.adapters.`in`.controller.dto

import br.com.connectify.users.application.core.domain.Gender
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.time.LocalDate

data class UpdateUserDTO(
    @NotBlank
    val userId: String,
    @NotBlank
    val firstName: String,
    @NotBlank
    val lastName: String,
    @NotBlank
    val username: String,
    @NotBlank
    val password: String,
    @NotBlank
    val description: String,
    @NotNull
    val birthDate: LocalDate,
    @NotNull
    val gender: Gender
)
