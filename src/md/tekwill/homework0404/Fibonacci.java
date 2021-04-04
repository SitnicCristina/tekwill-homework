package md.tekwill.homework0404;

import java.util.Scanner;

//fibonacci 0 1 1 2 3 5 8 13 21 34....
public class Fibonacci {
    public static void main(String[] args) {
        //Enter the number of terms of Fibonacci serie
        System.out.print("\nInput number of terms: ");
        Scanner in = new Scanner(System.in);
        int terms = in.nextInt();

        int prePrevious = 0;
        int previous = 1;
        int current;

        for (int i = 0; i < terms; i++) {
            current = prePrevious + previous;
            System.out.println(prePrevious + " ");
            prePrevious = previous;
            previous = current;
        }
    }
}
