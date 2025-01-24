package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//this is controller class

@RestController
@RequestMapping("/hello")
class FirstController {

    var obj = FirstService()  //create object of service layer class


    @GetMapping("/welcome")
    fun welcome(): String {
        return "My First Gradle Project , from Controller"
    }

    //-------------------------

    @GetMapping("/hello")
    fun hello(): String {
        return obj.hello()
    }

    //--------------------

    @GetMapping("/bye")
    fun bye(): String {
        return obj.bye()
    }
}