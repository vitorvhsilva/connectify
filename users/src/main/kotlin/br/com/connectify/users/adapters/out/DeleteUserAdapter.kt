package br.com.connectify.users.adapters.out

import br.com.connectify.users.adapters.out.repository.UserRepository
import br.com.connectify.users.application.ports.out.DeleteUserOutputPort
import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.CachePut

open class DeleteUserAdapter(
    val userRepository: UserRepository
): DeleteUserOutputPort {
    @CacheEvict(value = ["users"], key = "#id")
    override fun delete(id: String) {
        userRepository.deleteById(id)
    }
}