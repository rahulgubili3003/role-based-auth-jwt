package com.roles.auth.jwt.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor

@Entity
@Table(name = "users_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
data class Users(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, updatable = false, nullable = false)
    var id: Long = 0,

    @Column(name = "username", nullable = false)
    val username: String,

    @Column(name = "password", nullable = false)
    val password: String,

    @Column(name = "email", length = 50)
    val email: String,

    @Column(name = "roles")
    val roles: String
)


