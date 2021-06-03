package md.tekwill.homework1805;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        System.out.print("Enter the String to count the words: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("The String contains " + wordCounter(str) +" words");
    }

    public static int wordCounter(String str){
        int nrWords = 0;
        String[] splitString = str.split(" ");
        nrWords = splitString.length;
        return nrWords;
    }
}
