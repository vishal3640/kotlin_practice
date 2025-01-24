        package com.myKotlin

        fun main(args : Array<String>)
        {
           var result = volume(2,3)
            println("Total volume : $result")
        }

        @JvmOverloads  //it used for default argument also load in java file
        fun volume(length : Int , breath : Int , height : Int = 2) : Int //here, specify default argument
        {
            return length * breath * height
        }