package org.example.gomstest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GomstestApplication

fun main(args: Array<String>) {
    runApplication<GomstestApplication>(*args)
}
