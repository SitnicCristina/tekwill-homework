package md.tekwill.homework0804;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        //The user enter the elements of 3x3 matrix
        Scanner in = new Scanner(System.in);
        int lenght = 3;
        int[][] array = new int[lenght][lenght];

        System.out.println("Input elements in the matrix :");
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array[i][j] = in.nextInt();
            }
        }

        //print the matrix ex: [1, 2, 3][4, 5, 6][7, 8, 9]
        System.out.println("Or another representation would be:");
        for (int k = 0; k < lenght; ++k) {
            for (int l = 0; l < lenght; l++) {
                if (l == 0) {
                    System.out.print("[");
                }
                System.out.print(array[k][l]);
                if (l == lenght - 1) {
                    System.out.print("]");
                } else {
                    System.out.print(", ");
                }
            }
        }

        //Expected result as Matrix foreach
        System.out.println("Expected Output :\n" + "The matrix is :");
        for (int[] list : array) {
            System.out.println();
            for (int number : list) {
                System.out.print(number + " ");
            }
        }
    }
}

