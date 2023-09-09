package com.example.kotlinboardproject.user.repository

import com.example.kotlinboardproject.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*


interface UserRepository : JpaRepository<User, Long>{

    fun findUserByEmail(email : String) : User
}