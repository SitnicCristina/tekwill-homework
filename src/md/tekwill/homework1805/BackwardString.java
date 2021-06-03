package md.tekwill.homework1805;

import java.util.Scanner;

public class BackwardString {
    public static void main(String[] args) {
        System.out.print("Enter the String to revere: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Backward String: " + backwardString(str));
    }

    public static StringBuilder backwardString(String str) {
        StringBuilder backwardString = new StringBuilder(str);
        backwardString.reverse();
        return backwardString;
    }
}