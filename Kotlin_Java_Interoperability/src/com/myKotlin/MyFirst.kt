package com.myKotlin

import com.myJava.MyJavaFile

fun main(args : Array<String>)
    {
        var subresult = MyJavaFile.sub(45,33)  //call here sub() function from java
        println("Sub from java file $subresult")
    }

    fun add(a : Int , b : Int) : Int //method definition
    {
        return  a + b
    }


    /*

       * Internally this MyFirst.kt file is converted into MyFirstKt.class file
         like -

       public class MyFirstKt
       {
             public static void main(String[] args)
             {

             }

             public static int add(int a, int b)
             {
               return a + b
             }
       }

     */