package org.example.gomstest.global.error.exception

import org.example.gomstest.global.error.ErrorCode

open class GlobalException(val errorCode: ErrorCode): RuntimeException(errorCode.message)