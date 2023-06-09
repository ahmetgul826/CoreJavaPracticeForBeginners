package com.myproject.Homework;

public class IntDivMultip {
    public static void main(String[] args) {
        int n = 10; // The initial value of n

        System.out.print(n + " ");

        while (n != 1) {
            n = (n % 2 == 0) ? (n / 2) : (n * 3 + 1);
            System.out.print(n + " ");
        }
    }
    }

