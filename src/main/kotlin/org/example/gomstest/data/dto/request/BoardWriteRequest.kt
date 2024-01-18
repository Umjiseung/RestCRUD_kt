package org.example.gomstest.data.dto.request

import org.example.gomstest.data.enums.Major

data class BoardWriteRequest (
    val title: String,
    val content: String,
    val category: Major
)