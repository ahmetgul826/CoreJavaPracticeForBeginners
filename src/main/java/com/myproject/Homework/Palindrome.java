package com.myproject.Homework;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your number and I will check if it's Palindrome or not:");
        int given = scanner.nextInt();
        int remainder;
        int s = 0;
        int finale = given;

        while (given> 0){
            remainder = given % 10;//3      given = 153
            given = given/10;
            s = s*10+remainder;
        }
        if (finale == s ){
            System.out.println("Your number was a Palindrome number "+ s + " = "+ finale);
        }else {
            System.out.println("Your number was not a Palindrome number "+ s + " =/ " + finale);
        }
    }

}
