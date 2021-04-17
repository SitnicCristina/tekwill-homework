package md.tekwill.homework1604;

import java.util.Random;
import java.util.Scanner;

public class RandNbrGuessGame {
    public static void main(String[] args) {
        //The Program generate a random number under 1000
        Random rd = new Random();
        int randomNumber = rd.nextInt(1000);
        //The user enter the number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to guess: ");
        int userNumber = in.nextInt();
        //The Program check if is the correct number guessed
        do {
            if (userNumber > randomNumber) {
                System.out.print("Too high, try again: ");
            } else if (userNumber < randomNumber) {
                System.out.print("Too low, try again: ");
            }
            userNumber = in.nextInt();
        } while (userNumber != randomNumber);
        System.out.println("You entered the correct number: " + userNumber);
    }
}
