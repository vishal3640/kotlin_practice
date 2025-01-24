package com.example.demo

import org.springframework.stereotype.Service


//this is service layer class

@Service
class FirstService {

    var obj = FirstRepository()  //create object of DAO layer class

    fun hello(): String {
        return "hello From Service Layer"
    }

    //------------------------------

    fun bye(): String {
        return obj.bye()
    }
}