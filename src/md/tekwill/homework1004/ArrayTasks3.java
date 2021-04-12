package md.tekwill.homework1004;

import java.util.Arrays;

public class ArrayTasks3 {
    public static void main(String[] args) {
        //a) Set the 10 elements of integer array counts to zero
        Integer[] counts = new Integer[]{1, 2, 3, 4, 6, 8, 7, 3, 3, 6, 3, 1, 0, 5};
        for (int i = 0; i < 10; i++) {
            counts[i] = 0;
        }
        System.out.println(Arrays.deepToString(counts));

        //b) Add one to each of the 15 elements on integer array bonus
        Integer[] bonus = new Integer[]{10, 20, 13, 15, 18, 17, 30, 19, 25, 13, 19, 20, 12, 21, 23, 28, 26, 24, 40};
        for (int j = 0; j < 15; j++) {
            bonus[j] += 1;
        }
        System.out.println(Arrays.deepToString(bonus));

        //c) Display the five values of integer array bestScore in column format
        int[] bestScore = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95};
        for (int k = 1; k <= bestScore.length; k++) {
            System.out.print(bestScore[k-1] + " ");
            if (k % 5 == 0) {
                System.out.println();
            }
        }

    }
}
