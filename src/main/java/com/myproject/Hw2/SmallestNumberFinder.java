package com.myproject.Hw2;

import java.util.Scanner;

public class SmallestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int compare = num1;

        if (num2 < compare) {
            compare = num2;
        }

        if (num3 < compare) {
            compare = num3;
        }

        System.out.println("The smallest number is: " + compare);
    }
}

