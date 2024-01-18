package org.example.gomstest.service

import org.example.gomstest.data.dto.request.BoardWriteRequest

interface BoardService {
    fun boardWrite(boardWriteRequest: BoardWriteRequest)
}