package org.example.gomstest.controller

import org.example.gomstest.data.dto.request.BoardWriteRequest
import org.example.gomstest.service.BoardService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/board")
class BoardController(
    private val boardService: BoardService
) {

    @PostMapping
    fun boardWrite(@RequestBody writeRequest: BoardWriteRequest): ResponseEntity<Void> {
        boardService.boardWrite(writeRequest)
        return ResponseEntity.ok().build()
    }

}