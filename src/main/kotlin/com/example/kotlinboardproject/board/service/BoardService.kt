package com.example.kotlinboardproject.board.service

import com.example.kotlinboardproject.board.entity.Board
import com.example.kotlinboardproject.board.repository.BoardRepository
import jakarta.transaction.Transactional
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service
import java.util.*

@Service
class BoardService(private val boardRepository: BoardRepository) {

    @Transactional
    fun createBoard(board: Board): Board {
        return boardRepository.save(board)
    }

    fun getBoardByUUID(board_id: UUID) : Board {
        val board = boardRepository.findById(board_id).orElseThrow {throw NotFoundException()}
        return board
    }
}