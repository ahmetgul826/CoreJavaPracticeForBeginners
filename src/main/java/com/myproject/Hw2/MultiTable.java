package com.myproject.Hw2;
import java.util.Scanner;
public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Multiplication Table");
        for (int i = start; i <= end; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+"*"+ j+" = "+ i * j);
            }
            System.out.println();
        }
    }
}
