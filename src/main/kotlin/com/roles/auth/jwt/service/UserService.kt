package com.roles.auth.jwt.service

import com.roles.auth.jwt.dto.request.UserAddRequest
import com.roles.auth.jwt.entity.Users
import com.roles.auth.jwt.repository.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
    private val bCryptPasswordEncoder: BCryptPasswordEncoder
    ) {

    // Encrypt the Password before storing
    fun addUsers(addRequest: UserAddRequest) {
        val encryptedPassword = bCryptPasswordEncoder.encode(addRequest.password)
        val user = Users(
            username = addRequest.username,
            password = encryptedPassword,
            email = addRequest.email,
            roles = addRequest.role
        )
        userRepository.save(user)
    }
}