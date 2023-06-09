package com.myproject.Homework;

import java.util.Scanner;

/**
 * How 1634 is an Armstrong number?
 * Since 1634 is a four digit number, we can find out the sum of fourth power of each of its digits. Now, this sum turns out to be 1634.
 * 1^4 + 6^4 + 3^4 + 4^4
 * = 1 + 1296 + 81 + 256
 * = 1634
 * Hence, 1634 is an Armstrong number.
 * 371 is an Armstrong number, as 3^3 + 7^3 + 1^3 = 371
 */
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number, and I will see if it's Armstrong Number.\n Give me a number:");
        int given = scanner.nextInt();
        String length = String.valueOf(given);

        //153 1^3 = 1    5^3 = 125     3^3=27              and then add all.
        int sum = 0;
        int firstNum = given;
        while (given != 0) {
            int remainder = given % 10;//3
            given = given / 10;//15
            sum = sum+ (int) Math.pow(remainder, length.length());
        }
        if (sum == firstNum) {
            System.out.println("Your number is a armstrong number " + sum);
        } else {
            System.out.println("It is not an armstrong number " + sum);
        }
    }
}
