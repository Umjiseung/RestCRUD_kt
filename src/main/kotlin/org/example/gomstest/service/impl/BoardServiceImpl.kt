package org.example.gomstest.service.impl

import jakarta.transaction.Transactional
import org.example.gomstest.data.dto.request.BoardUpdateRequest
import org.example.gomstest.data.dto.request.BoardWriteRequest
import org.example.gomstest.data.dto.response.BoardGetResponse
import org.example.gomstest.data.dto.response.BoardGetsResponse
import org.example.gomstest.data.entity.Board
import org.example.gomstest.repository.BoardRepository
import org.example.gomstest.service.BoardService
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
            ?:throw RuntimeException()

        return BoardGetResponse(board)
    }

    override fun boardUpdate(id: Long, boardUpdateRequest: BoardUpdateRequest) {
        val board = boardRepository.findByIdOrNull(id)
            ?:throw RuntimeException()

        boardRepository.save(boardUpdateRequest.toEntity(board))
    }

}