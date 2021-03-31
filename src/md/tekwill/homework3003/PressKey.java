package md.tekwill.homework3003;
/**
 * 1. Write a Java program that detects key presses and prints to user the pressed key.
 * Test Data
 * Input key: 'a'
 * Expected Output :
 * You pressed 'a' character
 * Use a switch statement and limit yourself to 10 cases (say, from 0 to 9)
 */
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class PressKey {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the key: ");
        Scanner in = new Scanner(System.in);
        String keyTemp = in.nextLine();
        String keyTempUppercase = keyTemp.toUpperCase();
        char key = keyTempUppercase.charAt(0);

        switch (key) {
            case 'C':
                System.out.println("You pressed 'C' character");
                break;
            case 'R':
                System.out.println("You pressed 'R' character");
                break;
            case 'I':
                System.out.println("You pressed 'I' character");
                break;
            case 'S':
                System.out.println("You pressed 'S' character");
                break;
            default:
                System.out.println("The program doesn't recognised this key");
        }


    }
}
