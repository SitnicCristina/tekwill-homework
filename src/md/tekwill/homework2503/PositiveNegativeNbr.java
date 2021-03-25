package md.tekwill.homework2503;
/*1. Write a Java program to get a number from the user and print whether it is positive or negative.
Test Data
Input number: 35
Expected Output :
Number is positive*/
import java.util.Scanner;

public class PositiveNegativeNbr {
    public static void main(String[] args){
        System.out.print("Input a number to check if is positive or negative: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println();

        if (input<0){
            System.out.println("The number is negative ");
        }else{
            System.out.println("The number is positive ");
        }
    }
}
