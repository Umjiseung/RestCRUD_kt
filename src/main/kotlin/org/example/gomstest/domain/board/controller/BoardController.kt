package org.example.gomstest.domain.board.controller

import jakarta.validation.Valid
import org.example.gomstest.domain.board.data.dto.request.BoardUpdateRequest
import org.example.gomstest.domain.board.data.dto.request.BoardWriteRequest
import org.example.gomstest.domain.board.data.dto.response.BoardGetResponse
import org.example.gomstest.domain.board.data.dto.response.BoardGetsResponse
import org.example.gomstest.domain.board.service.BoardService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
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
    fun boardWrite(@Valid @RequestBody writeRequest: BoardWriteRequest): ResponseEntity<Void> {
        boardService.boardWrite(writeRequest)
        return ResponseEntity.ok().build()
    }

    @GetMapping
    fun boardGets(): ResponseEntity<List<BoardGetsResponse>> =
        boardService.boardGets()
            .let { ResponseEntity.ok(it) }

    @GetMapping("/{id}")
    fun boardGets(@PathVariable id: Long): ResponseEntity<BoardGetResponse> =
        boardService.boardGet(id)
            .let { ResponseEntity.ok(it) }

    @PatchMapping("/{id}")
    fun boardUpdate(@PathVariable id: Long, @Valid @RequestBody boardUpdateRequest: BoardUpdateRequest): ResponseEntity<Void> {
        boardService.boardUpdate(id, boardUpdateRequest)
        return ResponseEntity.ok().build()
    }

}