package md.tekwill.homework0104;

import java.util.Scanner;

//Write a program that asks the user to type in numbers. After each entry, the program should report sum of entries to date
//The program should terminate when the user enter 0;

public class CumulativeSumEntry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int entryNumber = in.nextInt();

        int summ = 0;

        for (; entryNumber != 0; ) {
            summ += entryNumber;
            System.out.println("Total sum is: " + summ);
            System.out.print("\nEnter the number: ");
            entryNumber = in.nextInt();
        }

    }
}
