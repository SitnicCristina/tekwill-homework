package md.tekwill.homework2503;

import java.util.Scanner;
/*2. Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87*/
public class GreatestNbr {
    public static void main(String[] args) {
        System.out.print("Input the number1: ");
        Scanner in = new Scanner(System.in);
        int nbr1 = in.nextInt();
        System.out.print("\nInput the number2: ");
        int nbr2 = in.nextInt();
        System.out.print("\nInput the number3: ");
        int nbr3 = in.nextInt();

        if(nbr1>nbr2 && nbr1>nbr3){
            System.out.println("the greatest number is:"+nbr1);
        }else if(nbr2>nbr1 && nbr2>nbr3){
            System.out.println("the greatest number is:"+nbr2);
        }else {
            System.out.println("the greatest number is:"+nbr3);
        }
    }
}
