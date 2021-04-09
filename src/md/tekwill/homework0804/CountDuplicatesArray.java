package md.tekwill.homework0804;

import java.util.Scanner;

/*Write a program in Java to count a total number of duplicate elements in an array.
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 5
element - 1 : 1
element - 2 : 1
or another representation would be
[5, 1, 1]
Expected Output :
Total number of duplicate elements found in the array is : 1
* */
public class CountDuplicatesArray {
    public static void main(String[] args) {
        //The user enter the length of array
        System.out.println("Input the number of elements to be stored in the array: ");
        Scanner in = new Scanner(System.in);
        int nbrElements = in.nextInt();
        int[] array = new int[nbrElements];
        int countDuplicate = 0;


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

        for(int k = 0; k<nbrElements; k++){
            for(int l = k+1; l<nbrElements; l++)
                if(array[k] == array[l]){
                    countDuplicate++;
                    break;
                }
        }
        //Print the output sum of element in the array
        System.out.println("\nTotal number of duplicate elements found in the array is: " + countDuplicate);
    }
}
