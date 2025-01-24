package com.example.ConsoleApplication

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class ConsoleApplication @Autowired constructor(
    private val calculatorService: CalculatorService // Constructor injection
) {
    @Bean
    fun commandLineRunner(): CommandLineRunner {
        return CommandLineRunner { args ->
            val scanner = Scanner(System.`in`)
            println("Enter numbers separated by spaces:")
            val input = scanner.nextLine()
            val numbersStr = input.split(" ")

            val numbers = numbersStr.mapNotNull {
                it.toIntOrNull() ?: run {
                    println("Invalid number: $it")
                    null
                }
            }.toIntArray()

            val sum = calculatorService.sum(*numbers)  // Using injected CalculatorService
            println("The sum of the numbers is: $sum")
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<ConsoleApplication>(*args)
        }
    }
}
