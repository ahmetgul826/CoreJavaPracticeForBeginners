package com.myproject.Homework;

import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number, and I will give the grade for it:");
        int grade = scanner.nextInt();

        if(grade >= 100){
            System.out.println("You have a AA.");
        }  else if( grade >= 81){
            System.out.println("You have a AB.");
        } else if (grade >= 71){
            System.out.println("You have a BB.");
        }else if (grade >= 61){
            System.out.println("You have a BC.");
        }else if (grade >= 51){
            System.out.println("You have a CD.");
        }else if (grade >= 41){
            System.out.println("You have a DD.");
        }else {
            System.out.println("You have failed.");
        }

    }
}
