package md.tekwill.homework1004;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayTasks2 {
    public static void main(String[] args) {
        //a) Write a statement that declare and creates t
        int[][] t = new int[][]{{1, 2, 3}, {4, 5, 6}};

        //b) How many rows does t have?
        int rows = t.length;
        System.out.println("Rows: " + rows);

        //c) How many columns does t have?
        int cols = t[0].length;
        System.out.println("Columns: " + cols);

        //d) How many elements does t have?
        System.out.println("Total elements: " + rows * cols);

        //e) Write access expressions for all the elements in row 1 of t
        System.out.println(t[0][0] + " " + t[0][1] + " " + t[0][2]);

        //f) Write access expressions for all the elements in row 2 of t
        System.out.println(t[1][0] + " " + t[1][1] + " " + t[1][2]);

        //g) Write a single statement that sets the element of t in row 0 and column 1 to zero
        t[0][1] = 0;
        System.out.println("\nThe matrix after set the t[0][1] to 0");
        for (int[] list : t) {
            for (int element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //h)Write individual statement to initialize each of t to zero
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        //i) Write a nested for statement that initialize each of t to zero
        System.out.println("\nThe matrix after initialize each of t to zero");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                t[i][j] = 0;
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        //j) Write a nested for statement that inputs the values for the elements of t from user
        System.out.println("\nEnter the elements of matrix from user");
        Scanner in = new Scanner(System.in);
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < cols; l++) {
                System.out.print("Enter the element [" + k + "][" + l + "] : ");
                int input = in.nextInt();
                t[k][l] = input;
            }
        }

        //k) Write a series of statements that determines and displays the smallest value in t
        int min = t[0][0];
        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < cols; n++) {
                if (t[m][n] < min) {
                    min = t[m][n];
                }
            }
        }
        System.out.println("\nThe smallest element value is " + min);

        //l) Write a single printf statement that display the elements of the first row of t
        System.out.println("Display the first row of t");
        for (int p = 0; p < cols; p++) {
            System.out.print(t[0][p] + " ");
        }

        //m) Write a statement that totals the elements of the third column of t. do not use repetition
        int thirdColumnSum = t[0][2] + t[1][2];
        System.out.println("\nTotals the elements of the third column " + thirdColumnSum);

        //n) Write a series of statements that display the contents of t in tabular format.
        //List the column indices as heading across the top and list the row indices at the left of each row

        //print the header
        for (int h = 0; h < cols; h++) {
            if(h==0) {System.out.print("  "+ h);}
            else System.out.print(" "+h);
        }
        System.out.println();
        //print the rows
        for (int r = 0; r < rows; r++) {
            System.out.print(r + " ");
            for (int c = 0; c < cols; c++) {
                System.out.print(t[r][c] + " ");
            }
            System.out.println(" ");
        }
    }
}

