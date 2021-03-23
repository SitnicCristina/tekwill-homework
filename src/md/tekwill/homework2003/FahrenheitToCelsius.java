package md.tekwill.homework2003;
/*1.Write a Java program to convert temperature from Fahrenheit to Celsius degree.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
*/
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit to convert in Celsius ex 212 :");
        double fahrenheit = in.nextDouble();

        double celsius =((fahrenheit-32)*5)/9;
        System.out.println(fahrenheit +" degree Fahrenheit is equal to "+celsius+" in Celsius");
    }
}

