package md.tekwill.homework1604;

import java.util.Scanner;

//Write a program that prompts the user to enter a string and display the number of the uppercase letters in the string
public class CountUpperCase {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int upperCase = 0;

        String wordToUppercase = word.toUpperCase();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) upperCase++;
        }
        System.out.println("The number of uppercase letters is " + upperCase);
    }
}
