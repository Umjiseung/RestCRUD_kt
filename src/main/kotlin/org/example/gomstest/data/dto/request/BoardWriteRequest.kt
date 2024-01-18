package org.example.gomstest.data.dto.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.example.gomstest.data.enums.Major

data class BoardWriteRequest (
    @field:NotBlank
    val title: String,
    @field:NotBlank
    val content: String,
    @field:NotNull
    val category: Major
)