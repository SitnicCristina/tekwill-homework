package md.tekwill.homework1604;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sale = new int[5];
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter today's sales for store " + i + ": ");
            sale[i - 1] = in.nextInt();
        }

        System.out.println("\nSALES BAR CHART");
        for (int j = 1; j <= 5; j++) {
            int asteriks = 0;
            System.out.print("Store " + j + ": ");
            asteriks = sale[j - 1] / 100;
            for (int k = 0; k < asteriks; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
