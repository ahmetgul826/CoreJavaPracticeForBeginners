package com.myproject.Day02Ex;

public class ArithmeticOp {
    public static void main(String[] args) {
        /*
        there are a lot of operators in java, and one of them is
        arithmetic operator. This is very simple, and you have most likely
        used this in your math class before. It's simply
        addition, subtraction, multiplication, division, and how to get the
        remainder of a problem.
         */

        int num1 = 24, num2 = 8;

        int num3 = num1 + num2; //32
        System.out.println("So when you print num3, you should simply get "+ num3);
        int substraction= num1 - num2;//16
        int div = num1/num2; //3
        int multip= num1*num2;//198
        int remainder = num1 % num2;//0 [remember this is the remainder meaning 24 / 8 is 3 leaving 0 behind.]
        /*
        so when we print these, we should get
        32
        16
        3
        192
        0
         */
        System.out.println(num3 + "\n" + substraction + "\n" + div + "\n" + multip + "\n" + remainder);

    }
}
