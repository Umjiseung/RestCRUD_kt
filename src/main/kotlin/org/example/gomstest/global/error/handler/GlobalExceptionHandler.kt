package org.example.gomstest.global.error.handler

import org.example.gomstest.global.error.exception.GlobalException
import org.example.gomstest.global.error.response.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(GlobalException::class)
    fun handler(e: GlobalException): ResponseEntity<ErrorResponse> =
        ResponseEntity(
            ErrorResponse(e.errorCode.message, e.errorCode.status.value()),
            HttpStatus.valueOf(e.errorCode.status.name)
        )

}