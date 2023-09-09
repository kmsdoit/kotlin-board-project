package com.example.kotlinboardproject.user.service

import com.example.kotlinboardproject.user.entity.User
import com.example.kotlinboardproject.user.repository.UserRepository
import jakarta.transaction.Transactional
import org.springframework.dao.DataAccessException
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    @Transactional
    fun createUser(user : User) : User {
        try {
            val createUser = userRepository.save(user)
            return createUser

        }catch (exception : DataAccessException) {
            throw exception
        }
    }
}