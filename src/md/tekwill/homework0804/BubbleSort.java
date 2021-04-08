package md.tekwill.homework0804;

import java.util.Scanner;

public class BubbleSort {
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

        //sorting
        int temp = 0;
        for (int k = 0; k < nbrElements; k++) {
            for (int l = 1; l < nbrElements; l++) {
                if (array[l - 1] > array[l]) {
                    //swap elements
                    temp = array[l - 1];
                    array[l - 1] = array[l];
                    array[l] = temp;
                }
            }
        }

        //print the sorted array
        System.out.println("/nElements of array in sorted ascending order: ");
        for (int m = 0; m < nbrElements; m++) {
            System.out.print(array[m] + " ");
        }
    }
}
