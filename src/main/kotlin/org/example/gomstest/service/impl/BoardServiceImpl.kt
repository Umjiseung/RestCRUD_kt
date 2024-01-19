package org.example.gomstest.service.impl

import jakarta.transaction.Transactional
import org.example.gomstest.data.dto.request.BoardWriteRequest
import org.example.gomstest.data.dto.response.BoardGetsResponse
import org.example.gomstest.data.entity.Board
import org.example.gomstest.repository.BoardRepository
import org.example.gomstest.service.BoardService
import org.springframework.stereotype.Service

@Service
@Transactional(rollbackOn = [Exception::class])
class BoardServiceImpl(
    private val boardRepository: BoardRepository
): BoardService {

    override fun boardWrite(boardWriteRequest: BoardWriteRequest) {
        val board = Board(
            id = 0L,
            title = boardWriteRequest.title,
            content = boardWriteRequest.content,
            category = boardWriteRequest.category
        )
        boardRepository.save(board)
    }

    override fun boardGets(): List<BoardGetsResponse> =
        boardRepository.findAll().let { boards ->
            boards.map { BoardGetsResponse(it) }
        }



}