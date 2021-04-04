package md.tekwill.homework0404;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Enter the number to calculate the factorial
        System.out.print("\nInput number to calculate factorial: ");
        Scanner in = new Scanner(System.in);
        int nbr = in.nextInt();

        int factorial = 1;
        for (int i = 1; i < nbr; i++) {
            factorial *= i + 1;
        }
        System.out.println(factorial);
    }
}
