package com.roles.auth.jwt.repository

import com.roles.auth.jwt.entity.Users
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<Users, Long> {
}