package org.example.gomstest.domain.board.data.entity

import jakarta.persistence.*
import org.example.gomstest.domain.board.data.enums.Major


@Entity
class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val title: String,
    val content: String,
    @Enumerated(EnumType.STRING)
    val category: Major
)