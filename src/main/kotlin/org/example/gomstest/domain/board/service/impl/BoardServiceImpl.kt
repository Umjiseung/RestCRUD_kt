package org.example.gomstest.domain.board.service.impl

import jakarta.transaction.Transactional
import org.example.gomstest.domain.board.data.dto.request.BoardUpdateRequest
import org.example.gomstest.domain.board.data.dto.request.BoardWriteRequest
import org.example.gomstest.domain.board.data.dto.response.BoardGetResponse
import org.example.gomstest.domain.board.data.dto.response.BoardGetsResponse
import org.example.gomstest.domain.board.data.entity.Board
import org.example.gomstest.domain.board.exception.BoardNotFoundException
import org.example.gomstest.domain.board.repository.BoardRepository
import org.example.gomstest.domain.board.service.BoardService
import org.springframework.data.repository.findByIdOrNull
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
        boardRepository.findAll()
            .map { BoardGetsResponse(it) }

    override fun boardGet(id: Long): BoardGetResponse {
        val board = boardRepository.findByIdOrNull(id)
            ?:throw BoardNotFoundException()

        return BoardGetResponse(board)
    }

    override fun boardUpdate(id: Long, boardUpdateRequest: BoardUpdateRequest) {
        val board = boardRepository.findByIdOrNull(id)
            ?:throw BoardNotFoundException()

        boardRepository.save(boardUpdateRequest.toEntity(board))
    }

}