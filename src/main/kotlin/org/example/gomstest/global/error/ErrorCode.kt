package org.example.gomstest.global.error

import org.springframework.http.HttpStatus

enum class ErrorCode(
    val message: String,
    val status: HttpStatus
) {

    BOARD_NOT_FOUND("해당하는 게시글을 찾을 수 없습니다.",HttpStatus.NOT_FOUND)

}