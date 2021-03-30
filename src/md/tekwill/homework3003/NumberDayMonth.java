package md.tekwill.homework3003;

import java.util.Scanner;

public class NumberDayMonth {
    public static void main(String[] args) {
        //Input month number
        System.out.println("Input month number (1-12): ");
        Scanner in = new Scanner(System.in);
        int weekDay = in.nextInt();

        //Print total numbers of day in month entered
        switch (weekDay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 12:
                System.out.println("Total number of days = 31");
                break;
            case 2:
                System.out.println("Total number of days = 28");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Total number of days = 30");
                break;
            default:
                System.out.println("Enter the correct number of month from 1 to 12 ");
                break;
        }
    }
}
