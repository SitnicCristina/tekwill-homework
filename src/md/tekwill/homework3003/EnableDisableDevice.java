package md.tekwill.homework3003;
/*
2. Write a Java program which will enable or disable a device in your house based on the code entered by user.
Test data
Input code: 0
Expected output:
You've enabled the lights in the bathroom
Another example -
Input key: 1
Expected output:
You've disabled the lights in the bathroom
The devices and printed statements are completely up to you. You decide what does each code does.
Limit yourself to 10 cases, so it means 5 devices with 2 options: enable/disabled, and each action assigned to a code,
which is also up to your choosing.
*/
import java.util.Locale;
import java.util.Scanner;

public class EnableDisableDevice {
    public static void main(String[] args) {
        System.out.print("Enter the device light, TV, coffee, alarm, music: ");
        Scanner in = new Scanner(System.in);
        String device = in.nextLine();
        System.out.print("\nInput key 1 for enable , 0 for disable: ");
        int key = in.nextInt();

        if (key == 0){
            switch (device) {
                case "light" -> System.out.println("You've disabled the lights in the bathroom");
                case "TV" -> System.out.println("You've turn off the TV in living room");
                case "coffee" -> System.out.println("You've turn off the coffee machine in kitchen");
                case "alarm" -> System.out.println("You've disable the alarm");
                case "music" -> System.out.println("You've stop the music");
                default -> System.out.println("The program doesn't recognise the device! ");
            }
        }else if(key == 1){
            switch (device) {
                case "light" -> System.out.println("You've enable the lights in the bathroom");
                case "TV" -> System.out.println("You've turn on the TV in living room");
                case "coffee" -> System.out.println("You've turn on the coffee machine in kitchen");
                case "alarm" -> System.out.println("You've enable the alarm");
                case "music" -> System.out.println("You've start the music");
                default -> System.out.println("The program doesn't recognise the device! ");
            }
        }else {
            System.out.println("Enter a 1 for enable and 0 for disable!");
        }
    }
}
