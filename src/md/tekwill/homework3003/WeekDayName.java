package md.tekwill.homework3003;

import java.util.Scanner;

public class WeekDayName {
    public static void main(String[] args) {
        //Enter the day of week
        System.out.println("Enter the week number (1-7): ");
        Scanner in = new Scanner(System.in);
        int weekDay = in.nextInt();

        //Print day name by day of week
        switch (weekDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter the correct day of week from 1 to 7 ");
        }
    }
}
