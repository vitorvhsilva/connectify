package br.com.connectify.users.adapters.exception

import java.lang.RuntimeException

class EntityNotFoundException : RuntimeException("Entity not found by id")