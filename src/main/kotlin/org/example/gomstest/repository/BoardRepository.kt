package org.example.gomstest.repository

import org.example.gomstest.data.entity.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository: JpaRepository<Board,Long> {
}