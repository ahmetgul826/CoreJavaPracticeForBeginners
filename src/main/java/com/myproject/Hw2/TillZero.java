package com.myproject.Hw2;

import java.util.Scanner;

public class TillZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers from the keyboard (enter 0 to stop):");

        int input = scanner.nextInt();
        while (input != 0) {
            System.out.println("Entered: " + input);
            input = scanner.nextInt();
        }

        System.out.println("Program stopped.");

        scanner.close();
    }
}
