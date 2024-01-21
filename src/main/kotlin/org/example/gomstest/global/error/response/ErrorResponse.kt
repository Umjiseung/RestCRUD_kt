package org.example.gomstest.global.error.response

import org.springframework.http.HttpStatus

data class ErrorResponse(
    val message: String,
    val status: Int
)
