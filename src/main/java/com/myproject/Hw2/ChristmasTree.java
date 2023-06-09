package com.myproject.Hw2;

public class ChristmasTree {
    public static void main(String[] args) {
        int height = 5;
        int width = 10;
        int x = 1;
        int space = width * 5;

        for (int i = 1; i <= height; i++) {

            for (int j = x; j <= width; j++) {
                for (int z = space; z >= j; z--) {
                    System.out.print(" ");
                }
                for (int y = 1; y <= j; y++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            x += 2;
            width += 2;
        }
        int trunk = 4;
        for (int i = 1; i <= trunk; i++) {
            for (int j = space-3; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int z = 1; z <= 4; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("HAPPY CHRISTMAS!");
    }
}
