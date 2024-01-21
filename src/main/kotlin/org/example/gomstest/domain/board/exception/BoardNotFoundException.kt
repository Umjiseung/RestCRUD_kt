package org.example.gomstest.domain.board.exception

import org.example.gomstest.global.error.ErrorCode
import org.example.gomstest.global.error.exception.GlobalException

class BoardNotFoundException: GlobalException(ErrorCode.BOARD_NOT_FOUND)