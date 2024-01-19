package org.example.gomstest.service

import org.example.gomstest.data.dto.request.BoardWriteRequest
import org.example.gomstest.data.dto.response.BoardGetsResponse

interface BoardService {
    fun boardWrite(boardWriteRequest: BoardWriteRequest)
    fun boardGets(): List<BoardGetsResponse>
}