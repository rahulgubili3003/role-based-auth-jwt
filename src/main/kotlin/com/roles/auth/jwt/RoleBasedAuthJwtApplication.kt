package com.roles.auth.jwt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RoleBasedAuthJwtApplication

fun main(args: Array<String>) {
	runApplication<RoleBasedAuthJwtApplication>(*args)
}
