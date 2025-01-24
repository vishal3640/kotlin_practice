package com.example.demo2_gradle_project

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux


@RestController
class Flux {

    @GetMapping("/flux")
    fun getData() : Flux<String>
    {
        return  Flux.just("Hi","Shubham","Lokhande") // o/p - HiShubhamLokhande
    }
}