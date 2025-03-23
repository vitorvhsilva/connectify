package br.com.connectify.users.adapters.`in`.controller.dto

data class UserFollowersDTO (
    val userId: String? = "",
    val followers: List<SimplifiedFollowersDTO>
)