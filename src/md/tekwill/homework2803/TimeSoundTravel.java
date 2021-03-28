package md.tekwill.homework2803;
/*
* medium  speed
* air     1.100  feet per second
* water   4.900  feet per second
* steel   16.400 feet per second
* */
import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeSoundTravel {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
        //The user enter the medium and distance
        System.out.println("Enter air, water or steel: ");
        Scanner in = new Scanner(System.in);
        String medium = in.nextLine();
        System.out.println("Enter the distance that a sound wave  will travel in the medium: ");
        int distance = in.nextInt();

        double time;
        if(medium.equalsIgnoreCase("air")){
            time =  distance / 1100.0;
            System.out.println("The amount of time it takes sound to travel in air is: " + df2.format(time) + " seconds");
        }else if(medium.equalsIgnoreCase("water")){
            time =  distance / 4900.0;
            System.out.println("The amount of time it takes sound to travel in water is: " + df2.format(time) + " seconds");
        }else if(medium.equalsIgnoreCase("steel")){
            time =  distance / 16400.0;
            System.out.println("The amount of time it takes sound to travel in steel is: " + df2.format(time) + " seconds");
        }else{
            System.out.println("Enter the correct medium!");
        }


    }
}
