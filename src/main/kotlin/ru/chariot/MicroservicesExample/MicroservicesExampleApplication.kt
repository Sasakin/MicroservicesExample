package ru.chariot.MicroservicesExample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MicroservicesExampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(MicroservicesExampleApplication::class.java, *args)
}
