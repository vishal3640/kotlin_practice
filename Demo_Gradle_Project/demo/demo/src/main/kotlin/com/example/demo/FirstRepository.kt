package com.example.demo

import org.springframework.stereotype.Repository

//this is repository class

@Repository
class FirstRepository {

    fun bye(): String {
        return "bye from DAO Layer"
    }


}