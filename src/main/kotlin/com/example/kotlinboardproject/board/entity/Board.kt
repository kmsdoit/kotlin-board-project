package com.example.kotlinboardproject.board.entity

import com.example.kotlinboardproject.user.entity.User
import jakarta.persistence.*
import org.jetbrains.annotations.NotNull
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "board")
class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id : UUID? = null,

    @NotNull
    var title : String,

    @NotNull
    var content : String,

    @ManyToOne
    var author : User,

    @CreatedDate
    var createDate : LocalDateTime = LocalDateTime.now(),

    @LastModifiedDate
    var modifiedDate : LocalDateTime = LocalDateTime.now()
) {



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Board

        if (id != other.id) return false
        if (title != other.title) return false
        if (content != other.content) return false
        if (author != other.author) return false
        if (createDate != other.createDate) return false
        if (modifiedDate != other.modifiedDate) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + title.hashCode()
        result = 31 * result + content.hashCode()
        result = 31 * result + author.hashCode()
        result = 31 * result + createDate.hashCode()
        result = 31 * result + modifiedDate.hashCode()
        return result
    }


}
