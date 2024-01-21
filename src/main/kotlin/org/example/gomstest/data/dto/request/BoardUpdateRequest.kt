package org.example.gomstest.data.dto.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.example.gomstest.data.entity.Board
import org.example.gomstest.data.enums.Major

data class BoardUpdateRequest(
    @field:NotBlank
    val title: String,
    @field:NotBlank
    val content: String,
    @field:NotNull
    val category: Major
) {
    fun toEntity(board: Board): Board =
        Board(
            id = board.id,
            title = board.title,
            content = board.content,
            category = board.category
        )
}