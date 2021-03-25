package md.tekwill.homework2503;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.print("Enter the letter grade A,B,C,D or F: ");
        Scanner in = new Scanner(System.in);
        String gradeLetter = in.nextLine();

        if(gradeLetter.equals("A")){
            System.out.println("The numeric value grade " + gradeLetter + "is 4");
        }else if(gradeLetter.equals("B")){
            System.out.println("The numeric value grade " + gradeLetter + "is 3");
        }else if(gradeLetter.equals("C")){
            System.out.println("The numeric value grade " + gradeLetter + "is 3");
        }else if(gradeLetter.equals("D")){
            System.out.println("The numeric value grade " + gradeLetter + "is 2");
        }else if(gradeLetter.equals("F")){
            System.out.println("The numeric value grade " + gradeLetter + "is 0");
        }else{
            System.out.println(gradeLetter + " is a invalid grade");
        }
    }
}
