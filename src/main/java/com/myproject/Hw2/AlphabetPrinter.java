package com.myproject.Hw2;

import java.util.Scanner;

public class AlphabetPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting alphabet: ");
        char start = scanner.nextLine().charAt(0);

        System.out.print("Enter the ending alphabet: ");
        char end = scanner.nextLine().charAt(0);

        if (start > end) {
            System.out.println("Invalid range. The starting alphabet should be less than or equal to the ending alphabet.");
            return;
        }
        System.out.print("Alphabets within the given range: ");
        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");


        }
    }
}