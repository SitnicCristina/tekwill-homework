package md.tekwill.homework2003;
/*3.Write a Java program to break an integer into a sequence of individual digits.
Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
Acest exercițiu este practică cu operatorul %
*/

public class UserPerformance {
    public static void main(String[] arg){
        double distance_m = 2500;

        // time 5:56:23
        double hour = 5;
        double minutes = 56;
        double second = 23;

        double time_to_seconds = hour*60*60 + minutes*60 + second;
        double time_to_hour = hour + minutes/60 + second/60/60;

        double speed_m_s = distance_m/time_to_seconds;
        double speed_km_h = distance_m/1000/time_to_hour;
        double speed_miles_h = distance_m/1609/time_to_hour;//1 mile = 1609 meters

        System.out.println("Your speed in meters/second is " + speed_m_s );//0.11691530655193377
        System.out.println("Your speed in km/h is " + speed_km_h);//0.4208951035869616
        System.out.println("Your speed in miles/h is " + speed_miles_h);//0.26158800720134345
    }
}
