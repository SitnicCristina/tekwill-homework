package md.tekwill.homework0804;

import java.util.Scanner;

public class SumElementArray {
    public static void main(String[] args) {
        //The user enter the length of array
        System.out.println("Input the number of elements to be stored in the array: ");
        Scanner in = new Scanner(System.in);
        int nbrElements = in.nextInt();
        int[] array = new int[nbrElements];
        int sum = 0;

        //The user enter the elements of array
        System.out.println("Input " + nbrElements + " elements in the array :");
        for (int i = 0; i < nbrElements; i++) {
            System.out.print("element - " + i + " : ");
            array[i] = in.nextInt();
            //calculate the sum of elements
            sum += array[i];
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

        //Print the output sum of element in the array
        System.out.println("\nSum of all elements stored in the array is: " + sum);
    }
}
