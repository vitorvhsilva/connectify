package br.com.connectify.users.adapters.`in`.controller.dto

import jakarta.validation.constraints.NotBlank

data class FollowUserDTO (
    @NotBlank
    val userId: String,
    @NotBlank
    val followerId: String
)