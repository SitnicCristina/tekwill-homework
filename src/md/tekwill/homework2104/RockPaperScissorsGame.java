package md.tekwill.homework2104;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        System.out.println("Play game Rock Paper Scissors");
        String computer = generateComputerChoice();
        String user = enterUserChoice();
        String winner = null;
        System.out.println("The computer's choice is: " + computer);
        do {
            if (computer.equals(user)) {
               computer = generateComputerChoice();
               user = enterUserChoice();
               System.out.println("The computer's choice is: " + computer);
            }
        } while (computer.equals(user));

        if (computer.equals("rock") && user.equals("scissors")) {
            winner = "computer";
        } else if (computer.equals("scissors") && user.equals("rock")) {
            winner = "user";
        } else if (computer.equals("scissors") && user.equals("paper")) {
            winner = "computer";
        } else if (computer.equals("paper") && user.equals("scissors")) {
            winner = "user";
        } else if (computer.equals("paper") && user.equals("rock")) {
            winner = "computer";
        } else if (computer.equals("rock") && user.equals("paper")) {
            winner = "user";
        }
        System.out.println("The winner is: " + winner);
    }

    public static String generateComputerChoice() {
        Random rd = new Random();
        int randomNumber = rd.nextInt(3) + 1;
        String computerChoice = null;
        switch (randomNumber) {
            case 1:
                computerChoice = "rock";
                break;
            case 2:
                computerChoice = "paper";
                break;
            case 3:
                computerChoice = "scissors";
                break;
        }
        return computerChoice;
    }

    public static String enterUserChoice() {
        Scanner in = new Scanner(System.in);
        String userEnter;
        Boolean userCorrectValue = false;
        do {
            System.out.print("\nEnter rock, paper or scissors: ");
            String userEnterConsole = in.nextLine();
            userEnter = userEnterConsole.toLowerCase();

            if (userEnter.equals("rock") || userEnter.equals("paper") || userEnter.equals("scissors")) {
                userCorrectValue = true;
            }
        } while (!userCorrectValue);
        return userEnter;
    }
}
