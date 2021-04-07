package md.tekwill.homework0604;

import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        //Enter the number of students
        System.out.print("\nEnter the numbers of students: ");
        Scanner in = new Scanner(System.in);
        int nbrStudents = in.nextInt();

        //Enter the each name and score for all students
        int i = 1;
        int highestScore = 0;
        String nameHighestScore ="";

        do {
            Scanner in1 = new Scanner(System.in);
            System.out.print("\nEnter the name of student: ");
            String name = in1.nextLine();
            System.out.print("Enter the score: ");
            int score = in1.nextInt();

            if (score > highestScore) {
                highestScore = score;
                nameHighestScore = name;
            }
            i++;
        } while (i <= nbrStudents);

        System.out.println("\nThe student with highest score is: "+ nameHighestScore +"\tgrade "+highestScore);
    }
}
