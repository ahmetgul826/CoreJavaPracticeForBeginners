package com.myproject.Homework;

import java.util.Scanner;
import java.util.SortedMap;

public class Day04Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //sumDouble
        System.out.print("Give me two numbers, and I will give the sumDouble of it. \nEnter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int sum = a + b;

        if (a == b) {
            sum *= 2;
        }

        System.out.println("The sum is: " + sum);

        System.out.println("-----------------------------------------------");
        //Product
        System.out.print("Give me two numbers, and I will give the product of it. \nEnter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int product = num1 * num2;
        System.out.println("The product is: " + product);
        System.out.println("-----------------------------------------------");


        //Which number out of the two is bigger
        System.out.println("Give me two numbers, and I will give determine the bigger number of it. \nEnter the first number: ");
        int numb1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int numb2 = scanner.nextInt();

        if (numb1 < numb2) {
            System.out.println("This bigger number is " + numb2);


        } else if (numb1 == numb2) {
            System.out.println("These numbers giver are equal: " + numb1 + "=" + numb2);
        } else {
            System.out.println("This bigger number is " + numb1);
        }
    }
}