package br.com.connectify.users.adapters.out.repository.entity

import br.com.connectify.users.application.core.domain.Gender
import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class UserEntity(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val userId: String,
    val firstName: String,
    val lastName: String,
    @Column(unique = true)
    val username: String,
    @Column(unique = true)
    val email: String,
    val password: String,
    val description: String,
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "userId")
    val following: List<UserEntity>,
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "userId")
    val followers: List<UserEntity>,
    val birthDate: LocalDate,
    var accountCreationDate: LocalDate,
    val gender: Gender
)