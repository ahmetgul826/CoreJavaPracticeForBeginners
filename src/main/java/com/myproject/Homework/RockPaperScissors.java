package com.myproject.Homework;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "scissors", "paper"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your choice (rock, scissors, paper) or 'exit' to quit: ");
            String userChoice = scanner.nextLine();

            if (userChoice.equals("exit")) {
                break;
            }

            String computerChoice = choices[random.nextInt(choices.length)];

            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (userChoice.equals("scissors") && computerChoice.equals("paper"))
                    || (userChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        System.out.println("Thank you for playing!");
    }
}

