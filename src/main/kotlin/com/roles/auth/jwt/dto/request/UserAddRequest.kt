package com.roles.auth.jwt.dto.request

import jakarta.validation.constraints.Size

data class UserAddRequest(
    val username: String,
    val password: String,
    @field:Size(max = 50)
    val email: String,
    val role: String
)
