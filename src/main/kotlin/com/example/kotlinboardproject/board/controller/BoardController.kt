package com.example.kotlinboardproject.board.controller

import com.example.kotlinboardproject.board.entity.Board
import com.example.kotlinboardproject.board.service.BoardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/api/v1")
class BoardController(private val boardService: BoardService) {

    @PostMapping("/board/create")
    fun createBoard(@RequestBody board : Board) : Board{
        return boardService.createBoard(board)
    }

    @GetMapping("/board/get")
    fun getByBoardByUUID(@RequestParam("id") uuid : UUID) : Board {
        return boardService.getBoardByUUID(uuid)
    }
}