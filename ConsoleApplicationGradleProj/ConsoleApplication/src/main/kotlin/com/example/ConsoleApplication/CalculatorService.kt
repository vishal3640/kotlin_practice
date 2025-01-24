package com.example.ConsoleApplication

import org.springframework.stereotype.Service

@Service
class CalculatorService {

    fun sum(vararg numbers: Int): Int {
        var result = 0

        for (num in numbers) {
            result += num
        }

        return result
    }
}