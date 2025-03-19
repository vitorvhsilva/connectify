package br.com.connectify.users.adapters.`in`.controller

import br.com.connectify.users.adapters.`in`.controller.dto.CreateUserInputDTO
import br.com.connectify.users.adapters.`in`.controller.dto.CreateUserOutputDTO
import br.com.connectify.users.adapters.`in`.controller.mapper.UserControllerMapper
import br.com.connectify.users.application.ports.`in`.PersistUserInputPort
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController (
    val mapper: UserControllerMapper,
    val persistUser: PersistUserInputPort
){
    @PostMapping
    fun persist(dto: CreateUserInputDTO): ResponseEntity<CreateUserOutputDTO> {
        val user = mapper.createInputToEntity(dto)
        val persistedUser = persistUser.persist(user)
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.entityToCreateOutput(persistedUser))
    }
}