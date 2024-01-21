package org.example.gomstest.domain.board.service

import org.example.gomstest.domain.board.data.dto.request.BoardUpdateRequest
import org.example.gomstest.domain.board.data.dto.request.BoardWriteRequest
import org.example.gomstest.domain.board.data.dto.response.BoardGetResponse
import org.example.gomstest.domain.board.data.dto.response.BoardGetsResponse

interface BoardService {
    fun boardWrite(boardWriteRequest: BoardWriteRequest)
    fun boardGets(): List<BoardGetsResponse>
    fun boardGet(id: Long): BoardGetResponse
    fun boardUpdate(id: Long, boardUpdateRequest: BoardUpdateRequest)
}