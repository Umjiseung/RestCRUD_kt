package org.example.gomstest.domain.board.repository

import org.example.gomstest.domain.board.data.entity.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository: JpaRepository<Board,Long> {
}