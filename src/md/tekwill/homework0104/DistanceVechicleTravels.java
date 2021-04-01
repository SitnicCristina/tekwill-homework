package md.tekwill.homework0104;

import java.util.Scanner;

//distance = speed * time

public class DistanceVechicleTravels {
    public static void main(String[] args) {
        //Ask the user to enter the speed miles/hour
        System.out.print("Enter the speed miles/hour: ");
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();
        System.out.print("\nEnter the hours of travel: ");
        int time = in.nextInt();

        int distanceTraveled = 0;

        //display the report table header
        System.out.println("Hour     Distance Traveled");
        System.out.println("__________________________");

        //display the table result
        for (int i=1; i<=time; i++){
            distanceTraveled = speed * i;
            System.out.println(i + "        " + distanceTraveled);
        }
    }
}
