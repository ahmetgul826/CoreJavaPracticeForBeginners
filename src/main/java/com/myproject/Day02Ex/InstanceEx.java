package com.myproject.Day02Ex;

public class InstanceEx {


    public static void main(String[] args) {
        int a = 8;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
