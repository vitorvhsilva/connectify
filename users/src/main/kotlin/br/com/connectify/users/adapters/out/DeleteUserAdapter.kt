package br.com.connectify.users.adapters.out

import br.com.connectify.users.adapters.out.repository.UserRepository
import br.com.connectify.users.application.ports.out.DeleteUserOutputPort

class DeleteUserAdapter(
    val userRepository: UserRepository
): DeleteUserOutputPort {
    override fun delete(id: String) {
        userRepository.deleteById(id)
    }
}