package md.tekwill.homework1004;

import java.util.Arrays;
import java.util.Random;

public class ArrayTasks1 {
    public static void main(String[] args) {
        int[] f = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println("a. Display the value of element 6 of array f: " + f[5]);

        int[] g = {8, 9, 10, 11, 12, 13, 14};
        System.out.println("\nb. Initialize each of the five elements of one-dimensional integer array g to 8");
        for (int i = 0; i < 5; i++) {
            g[i] = 8;
        }
        for (int j : g) {
            System.out.print(j + " ");
        }

        System.out.println("\n\nc. Total the 100 elements of floating-point array c: ");
        Random rd = new Random();
        float[] c = new float[100];
        float sum = 0;
        for (int k = 0; k < c.length; k++) {
            c[k] = rd.nextFloat();
            //String.format("%.2f", c[k]);
            System.out.print(String.format("%.2f", c[k]) + ",");
            sum += c[k];
        }
        System.out.print("\nThe sum: " + String.format("%.2f", sum));

        System.out.println("\nd. Copy 11-element array a into the first portion of array b, which contains 34 elements ");
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12, 13, 14, 15, 16};
        int[] b = new int[34];
        for (int l = 0; l < 11; l++) {
            b[l] = a[l];
        }
        for (int n : b) {
            System.out.print(n + " ");
        }

        System.out.println("\nDetermine and display the smallest and largest values contained in 99-element floating-point array w ");
        float[] w = new float[99];
        w[0] = 2.4f;
        w[14] = 0.3f;
        w[29] = 8.4f;
        w[45] = 1.5f;
        w[90] = 9.1f;
        w[98] = 9.4f;

        Arrays.sort(w);

        System.out.println("The smallest value is: " + w[0] + " and largest values is: " + w[98]);
    }
}
