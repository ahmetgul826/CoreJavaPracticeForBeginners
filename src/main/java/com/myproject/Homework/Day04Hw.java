package com.myproject.Homework;

import java.util.Scanner;

public class Day04Hw {
    public static void main(String[] args) {
        Scanner math = new Scanner(System.in);
        //fibonacci
        System.out.println("Enter a number, and I will you the Fibonacci numbers.");
        int userNum = math.nextInt();

        int num1 = 0;
        int sum;
        for (int num2 = 1; num1 <= userNum; num2 = sum) {
            System.out.print(num1 + ", ");
            sum = num1 + num2;
            num1 = num2;
        }
        System.out.println();
        //biggest and smallest out of 3 numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int numb3 = scanner.nextInt();

        int maximum = Math.max(numb1, Math.max(numb2, numb3));
        int minimum = Math.min(numb1, Math.min(numb2, numb3));

        System.out.println("Maximum number: " + maximum);
        System.out.println("Minimum number: " + minimum);

        //even or odd
        System.out.print("Enter a number and I will tell you if it is even or odd: ");
        int userNum2 = scanner.nextInt();

        if (userNum2 % 2 == 0) {
            System.out.println(userNum2 + " is an even number.");
        } else {
            System.out.println(userNum2 + " is an odd number.");
        }
        //voting age
        System.out.print("Enter your age and I will let you know if you can vote: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }



    }

}



