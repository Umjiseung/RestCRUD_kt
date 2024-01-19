package org.example.gomstest.data.dto.response

import org.example.gomstest.data.entity.Board
import org.example.gomstest.data.enums.Major

data class BoardGetsResponse (
    val id: Long,
    val title: String,
    val content: String,
    val category: Major
) {
    constructor(board: Board): this(
        id = board.id,
        title = board.title,
        content = board.content,
        category = board.category
    )
}