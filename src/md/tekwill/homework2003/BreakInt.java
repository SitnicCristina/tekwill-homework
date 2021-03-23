package md.tekwill.homework2003;
/*3.Write a Java program to break an integer into a sequence of individual digits.
Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
Acest exercițiu este practică cu operatorul %
*/

import java.util.Scanner;

public class BreakInt {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the int to break: ");
       int input = in.nextInt();

       /*while (input>0)
        {
            System.out.print(" "+input%10);// output 6 5 4 3 2 1
            input = input/10;
       }*/

       // output 1 2 3 4 5 6
       int input1 = 123456;
       System.out.print(" " + (input1 / 100000) % 10);
       System.out.print(" " + (input1 / 10000) % 10);
       System.out.print(" " + (input1 / 1000) % 10);
       System.out.print(" " + (input1 / 100) % 10);
       System.out.print(" " + (input1 / 10) % 10);
       System.out.print(" " + input1 % 10);


    }
}
