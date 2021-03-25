package md.tekwill.homework2503;
/*
* 3. Write a Java program that reads a number from the user
* and displays the name of the weekday based on user's number.
Test Data
Input number: 3
Expected Output :
Wednesday*/

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args){
        System.out.print("Input the week day number(1-7) to get the name of day: ");
        Scanner in = new Scanner(System.in);
        int weekDay = in.nextInt();

        if(weekDay == 1){
            System.out.println("For number " + weekDay + " the day of week in Monday");
        } else if(weekDay == 2){
            System.out.println("For number " + weekDay + " the day of week in Tuesday");
        }else if(weekDay == 3){
            System.out.println("For number " + weekDay + " the day of week in Wednesday");
        }else if(weekDay == 4){
            System.out.println("For number " + weekDay + " the day of week in Thursday");
        }else if(weekDay == 5){
            System.out.println("For number " + weekDay + " the day of week in Friday");
        }else if(weekDay == 6){
            System.out.println("For number " + weekDay + " the day of week in Saturday");
        }else if(weekDay == 7){
            System.out.println("For number " + weekDay + " the day of week in Sunday");
        }else {
            System.out.println("Please enter the correct number of day");
        }

    }
}
