package md.tekwill.homework0804;
/**
 * Write a program in Java for a 2D array (bi-dimensional array) of size 3x3 and print the matrix.
 * Test Data :
 * Input elements in the matrix :
 * element - [0],[0] : 1
 * element - [0],[1] : 2
 * element - [0],[2] : 3
 * element - [1],[0] : 4
 * element - [1],[1] : 5
 * element - [1],[2] : 6
 * element - [2],[0] : 7
 * element - [2],[1] : 8
 * element - [2],[2] : 9
 * or another representation would be
 * [1, 2, 3][4, 5, 6][7, 8, 9]
 * Expected Output :
 * The matrix is :
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */

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
        for (int[] m : array) {
            System.out.println();
            for (int n : m) {
                System.out.print(n + " ");
            }
        }
    }
}

