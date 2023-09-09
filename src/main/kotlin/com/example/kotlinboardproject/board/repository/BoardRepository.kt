package com.example.kotlinboardproject.board.repository

import com.example.kotlinboardproject.board.entity.Board
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface BoardRepository : JpaRepository<Board, UUID> {

}