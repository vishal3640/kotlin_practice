package com.example.demo2_gradle_project

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class Mono<T> {

    @GetMapping("/mono")
    fun getdata() : Mono<String>
    {
        return Mono.just("hi shubham") // o/p - hi shubham
    }

}