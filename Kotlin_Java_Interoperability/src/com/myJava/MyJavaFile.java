package com.myJava;

import com.myKotlin.MyFirstKt;

public class MyJavaFile {

        public static void main(String[] args)
        {
            int sum = MyFirstKt.add(34,45); //call here add() function from kotlin
            System.out.println("Sum from kotlin file : " + sum);
        }

        public static int sub(int a, int b) //method definition
        {
            return a - b;
        }
    }
