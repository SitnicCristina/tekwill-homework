package md.tekwill.homework0404;

import java.util.ArrayList;
import java.util.Scanner;

/*read 5 numbers between 1 and 30. for each number display asterisks.
Display the bar of asterisks after you read all 5 numbers */
public class ChartBar {
    public static void main(String[] args) {
        //define the List
        ArrayList<Integer> myList = new ArrayList<>();
        //Read 5 number and save on List
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter the number from 1 to 30: ");
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            //Check the number entered is from 1 to 30
            if (number >= 1 && number <=30) {
                myList.add(number);
            } else {
                System.out.println("Enter a number from 1 to 30! Please enter again: ");
                //decrement the index for user enter again the number
                i--;
            }
        }
        //Read object from list and print as much asterisks from value of object
        for (Integer myObject : myList) {
            for (int j = 0; j < myObject; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
