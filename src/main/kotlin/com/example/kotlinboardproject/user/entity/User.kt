package com.example.kotlinboardproject.user.entity

import com.example.kotlinboardproject.board.entity.Board
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import org.jetbrains.annotations.NotNull
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long? = null,

    @NotNull
    var email : String,

    @NotNull
    var password : String,

    @CreatedDate
    var createDate : LocalDateTime = LocalDateTime.now(),

    @LastModifiedDate
    var modifiedDate : LocalDateTime = LocalDateTime.now(),
) {


}