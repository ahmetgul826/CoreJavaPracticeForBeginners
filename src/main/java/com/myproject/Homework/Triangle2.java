package com.myproject.Homework;

public class Triangle2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int a = 0; a <= i; a++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");

        char input;
        char forinp;
        for (input = 'A'; input <= 'E'; input++) {
            System.out.print(input);
        }
        System.out.println("------------------");

        char d = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(d + " ");
            }
            System.out.println();
            d++;
        }
    }
}