package org.example.gomstest.data.dto.request

import jakarta.validation.constraints.NotBlank
import org.example.gomstest.data.enums.Major

data class BoardWriteRequest (
    @NotBlank
    val title: String,
    @NotBlank
    val content: String,
    @NotBlank
    val category: Major
)