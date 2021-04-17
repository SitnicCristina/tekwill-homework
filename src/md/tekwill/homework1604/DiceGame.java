package md.tekwill.homework1604;

import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        int scoreComputer = 0;
        int scoreUser = 0;
        for (int i = 1; i <= 10; i++) {
            Random rd = new Random();
            int computerDie = rd.nextInt(6) + 1;
            int userDie = rd.nextInt(6) + 1;
            System.out.println("Interation " + i + "\tComputer Die: " + computerDie + "\tUser Die: " + userDie);

            if (computerDie > userDie) {
                scoreComputer += 1;
            } else if (computerDie < userDie) {
                scoreUser += 1;
            }
        }
        //Print the results
        if (scoreComputer > scoreUser) {
            System.out.println("The grad winner is computer ");
        } else if (scoreComputer < scoreUser) {
            System.out.println("The grad winner is User ");
        } else {
            System.out.println("The grad winner are both ");
        }
    }
}
