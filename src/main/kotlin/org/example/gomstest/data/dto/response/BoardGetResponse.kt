package org.example.gomstest.data.dto.response

import org.example.gomstest.data.entity.Board
import org.example.gomstest.data.enums.Major

data class BoardGetResponse (
    val title: String,
    val content: String,
    val category: Major
) {
    constructor(board: Board): this(
        title = board.title,
        content = board.content,
        category = board.category
    )
}