package com.roles.auth.jwt.controller

import com.roles.auth.jwt.dto.request.UserAddRequest
import com.roles.auth.jwt.dto.response.OkResponse
import com.roles.auth.jwt.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {

    @PostMapping("/add")
    fun addUsers(@RequestBody userAddRequest: UserAddRequest): ResponseEntity<OkResponse> {
        userService.addUsers(userAddRequest)
        return ResponseEntity.ok(OkResponse())
    }
}