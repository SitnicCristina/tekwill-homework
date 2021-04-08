package md.tekwill.homework0804;

import java.util.Scanner;

/**
 * Write a program in Java to find the maximum and minimum element in an array.
 * Test Data :
 * Input the number of elements to be stored in the array :3
 * Input 3 elements in the array :
 * element - 0 : 45
 * element - 1 : 25
 * element - 2 : 21
 * or another representation would be
 * [45, 25, 21]
 * Expected Output :
 * Maximum element is : 45
 * Minimum element is : 21
 */

public class MinMaxArray {
    public static void main(String[] args) {
        //The user enter the length of array
        System.out.println("Input the number of elements to be stored in the array: ");
        Scanner in = new Scanner(System.in);
        int nbrElements = in.nextInt();
        int[] array = new int[nbrElements];

        //The user enter the elements of array
        System.out.println("Input " + nbrElements + " elements in the array :");
        for (int i = 0; i < nbrElements; i++) {
            System.out.print("element - " + i + " : ");
            array[i] = in.nextInt();
        }

        //Another representation of array ex: [2, 5, 8]
        System.out.println("or another representation would be");
        for (int j = 0; j < nbrElements; ++j) {
            if (j == 0) {
                System.out.print("[");
            }
            System.out.print(array[j]);
            if (j == nbrElements - 1) {
                System.out.print("]");
            } else {
                System.out.print(", ");
            }
        }

        //Check the minimum an maximum
        int min = array[0];
        int max = array[0];
        for (int k = 1; k < nbrElements; k++) {
            if (array[k] < min) {
                min = array[k];
            }else if (array[k] > max) {
                max = array[k];
            }
        }

        System.out.println("\nMaximum element is : " + max + "\nMinimum element is : " + min);
    }
}
