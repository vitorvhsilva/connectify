package br.com.connectify.users.adapters.exception

import java.lang.RuntimeException

class UsernameAlreadyExistsException: RuntimeException("Username already exists!")