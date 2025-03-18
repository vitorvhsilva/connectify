package br.com.connectify.users.application.core.domain

import java.time.LocalDate

data class User(
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
    val accountCreationDate: LocalDate,
    val gender: Gender
)
