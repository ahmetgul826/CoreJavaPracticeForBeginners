package com.myproject.Day01_01;

public class DataTypesEx {
    public static void main(String[] args) {
        float MathTest1 = 83;
        float MathTest2 = 98;
        float MathAvg = ((MathTest1 + MathTest2) / 200) * 100;

        System.out.println("The average of both tests were " + MathAvg+"%");
        /*
        byte, int, short, long, are all number related data types.
        and if you want a data type for decimals, float and double are some good data
        types you might want to use.
         */
        byte num1 = 4;
        byte num2 = 0;

        System.out.println("Manchester City vs Real Madrid ended in a "+ num1 +"-"+ num2);

        /*
        char special ability is to help you have single letters and it comes from the ASCII table.
        for char to work, when you give its value, you have to use single quotations.
         */
        char letter = 'a';
        char letter2 = 'b';
        System.out.println(letter2);
    }
}