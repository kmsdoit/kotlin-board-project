package com.example.kotlinboardproject.user.controller

import com.example.kotlinboardproject.user.entity.User
import com.example.kotlinboardproject.user.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class UserController(private val userService: UserService) {

    @PostMapping("/create")
    fun createUser(@RequestBody user : User): User {
        return userService.createUser(user)
    }
}