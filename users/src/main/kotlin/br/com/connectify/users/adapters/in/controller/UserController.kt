package br.com.connectify.users.adapters.`in`.controller

import br.com.connectify.users.adapters.`in`.controller.dto.*
import br.com.connectify.users.adapters.`in`.controller.mapper.UserControllerMapper
import br.com.connectify.users.application.ports.`in`.*
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class UserController (
    val mapper: UserControllerMapper,
    val persistUser: PersistUserInputPort,
    val getUserById: GetUserByIdInputPort,
    val updateUser: UpdateUserInputPort,
    val deleteUser: DeleteUserInputPort,
    val followUser: FollowUserInputPort
){
    @PostMapping
    fun persist(@RequestBody dto: CreateUserInputDTO): ResponseEntity<CreateUserOutputDTO> {
        val user = mapper.createInputToEntity(dto)
        val persistedUser = persistUser.persist(user)
        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.entityToCreateOutput(persistedUser))
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: String): ResponseEntity<GetUserDTO> {
        val user = getUserById.get(id)
        return ResponseEntity.ok(mapper.entityToGetUser(user))
    }

    @PutMapping
    fun updateUser(@RequestBody dto: UpdateUserDTO): ResponseEntity<GetUserDTO> {
        val user = mapper.updateUserToEntity(dto)
        val updatedUser = updateUser.update(user)
        return ResponseEntity.ok(mapper.entityToGetUser(updatedUser))
    }

    @DeleteMapping("{/id}")
    fun deleteUser(@PathVariable id: String): ResponseEntity<Void> {
        deleteUser.delete(id)
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
    }

    @PostMapping("/follow")
    fun followUser(@RequestBody dto: FollowUserDTO): ResponseEntity<UserFollowersDTO> {
        val user = followUser.follow(dto.userId, dto.followerId)
        val userFollowers: UserFollowersDTO = mapper.entityToUserFollowers(user)
        return ResponseEntity.ok(userFollowers)
    }
}