package com.myproject.Hw2;

import java.util.Scanner;

public class InfoCitizen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter your Age: ");
        String age = scanner.nextLine();

        System.out.print("Enter your Phone Number: ");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.length() < 10 || phoneNumber.length() > 10) {
            System.out.println("Please enter a 10 digit number");
            phoneNumber = scanner.nextLine();

        }

        System.out.print("Enter your City: ");
        String city = scanner.nextLine();

        System.out.println("\nPlease verify below details are correct:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("City: " + city);

        System.out.println("\nChoose one of the options (1 or 2):");
        System.out.println("1- All given information is correct");
        System.out.println("2- I need to re-enter the information");

        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Thank you for verifying the information!");
        } else if (option == 2) {
            System.out.println("Re-enter the information:");
            System.out.print("Name: ");
            name = scanner.next();

            System.out.print("Gender: ");
            gender = scanner.next();

            System.out.print("Age: ");
            age = scanner.next();


            System.out.print("Phone Number: ");
            phoneNumber = scanner.next();
            if (phoneNumber.length() < 10 || phoneNumber.length() > 10) {
                System.out.println("Please enter a 10 digit number");
                phoneNumber = scanner.next();
            }
            System.out.print("City: ");
            city = scanner.next();

            System.out.println("\nPlease verify below details are correct:");
            System.out.println("Name: " + name);
            System.out.println("Gender: " + gender);
            System.out.println("Age: " + age);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("City: " + city);
        } else {
            System.out.println("Invalid option chosen.");
        }
        scanner.close();
    }
}


