package br.com.connectify.users.adapters.out.repository

import br.com.connectify.users.adapters.out.repository.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, String> {
}