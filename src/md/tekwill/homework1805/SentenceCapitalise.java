package md.tekwill.homework1805;

import java.util.Scanner;

public class SentenceCapitalise {

    public static void main(String[] args) {
        System.out.print("Enter the Sentence : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("The String contains " + sentenceCapitalize(str) + " words");
    }

    public static String sentenceCapitalize(String str) {
        String sentenceCapitalize = new String(str);
        

        return sentenceCapitalize;
    }
}
