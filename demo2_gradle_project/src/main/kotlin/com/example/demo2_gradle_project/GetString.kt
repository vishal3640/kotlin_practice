package com.example.demo2_gradle_project

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GetString {

    @GetMapping("/")
    fun getData() : String
    {
        return "Shubham" // o/p - Shubham
    }
}