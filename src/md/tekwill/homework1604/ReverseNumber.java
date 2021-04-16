package md.tekwill.homework1604;

import java.util.Scanner;
import java.lang.*;

// Write a program that reads the integers and display them in the reverse of the order in witch they were read

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = 1;
        do {
            System.out.print("Enter the number " + i + " what should be reverse: ");
            int input = in.nextInt();

            StringBuffer intToString = new StringBuffer(Integer.toString(input));
            StringBuffer stringReversed = intToString.reverse();
            Integer numberReversed = Integer.valueOf(String.valueOf(stringReversed));
            System.out.print("The number reversed is: "+numberReversed+"\n\n");
            i++;

        } while (i <= 10);
    }
}
