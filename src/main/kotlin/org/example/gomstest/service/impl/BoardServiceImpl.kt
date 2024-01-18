package org.example.gomstest.service.impl

import jakarta.transaction.Transactional
import org.example.gomstest.data.dto.request.BoardWriteRequest
import org.example.gomstest.data.entity.Board
import org.example.gomstest.repository.BoardRepository
import org.example.gomstest.service.BoardService
import org.springframework.stereotype.Service

@Service
class BoardServiceImpl(
    private val boardRepository: BoardRepository
): BoardService {

    @Transactional(rollbackOn = [Exception::class])
    override fun boardWrite(boardWriteRequest: BoardWriteRequest) {
        val board = Board(
            title = boardWriteRequest.title,
            content = boardWriteRequest.content,
            category = boardWriteRequest.category
        )
        boardRepository.save(board)
    }

}