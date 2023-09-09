package com.example.kotlinboardproject.user.repository

import com.example.kotlinboardproject.user.entity.User
import jakarta.transaction.Transactional
import org.aspectj.lang.annotation.Before
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.assertj.core.api.Assertions.*
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime

@SpringBootTest
class UserRepositoryTest @Autowired constructor(
    val userRepository: UserRepository
){
   @BeforeEach
   fun cleanUserEntity() {
       userRepository.deleteAll()
   }

    @Test
    @DisplayName("유저 생성 테스트")
    fun createUserJPATest() {
        val user : User = User(1L,"mskim@idb.ai", "password", createDate = LocalDateTime.now(), modifiedDate = LocalDateTime.now())
        userRepository.save(user)
        val createdUser = userRepository.findUserByEmail(user.email)
        assertThat(createdUser.email).isEqualTo("mskim@idb.ai")
    }


}