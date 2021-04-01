package md.tekwill.homework0104;

import java.util.Scanner;
//Calculate and report the summ of all the integers between and including two integers. ex: 2 to 9 = 44
public class SummInteger {
    public static void main(String[] args) {
        //Request the user to enter two integers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the smaller Integer: ");
        int smallerInt = in.nextInt();
        System.out.println("Enter the bigger Integer: ");
        int biggerInt = in.nextInt();

        int summ = 0;

        //Calculate the summ from smallerInt to biggerInt
        for(int i=smallerInt; i<=biggerInt ; i++){
            summ +=  i;
        }
        System.out.println("The summ from "+ smallerInt + " to " + biggerInt + " is: " + summ );
    }
}
