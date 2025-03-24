package br.com.connectify.users.adapters.`in`.controller.dto

import br.com.connectify.users.application.core.domain.Gender
import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.LocalDate

data class CreateUserInputDTO(
    @NotBlank @Size(min = 3)
    val firstName: String,
    @NotBlank @Size(min = 3)
    val lastName: String,
    @NotBlank @Size(min = 8)
    val username: String,
    @Email
    val email: String,
    @NotBlank @Size(min = 8)
    val password: String,
    @NotNull @JsonFormat(pattern="yyyy-MM-dd")
    val birthDate: LocalDate,
    @NotNull
    val gender: Gender
)
