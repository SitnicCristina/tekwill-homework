package md.tekwill.homework2803;

import java.util.Scanner;

public class InternetServiceProvider {
    public static void main(String[] args) {
        //The user should enter the subscription package for internet service: A, B or C
        System.out.print("Enter the internet subscription package: ");
        Scanner in = new Scanner(System.in);
        String packageType = in.nextLine();
        System.out.print("\nEnter the hours used per month: ");
        int hoursUsed = in.nextInt();

        //Calculate and display the monthly bill of internet service
        double totalCharges;
        if(packageType.equalsIgnoreCase("A")){
            totalCharges = (hoursUsed > 10) ? 9.95 + (hoursUsed-10)*2 : 9.95;
            System.out.println("The total bill for package A and " + hoursUsed + " hours used is: " + totalCharges + "$");
        }else if(packageType.equalsIgnoreCase("B")){
            totalCharges = (hoursUsed > 20) ? 13.95 + (hoursUsed-20) : 13.95;
            System.out.println("The total bill for package B and " + hoursUsed + " hours used is: " + totalCharges + "$");
        }else if(packageType.equalsIgnoreCase("C")){
            totalCharges = 19.95;
            System.out.println("The total bill for package C and " + hoursUsed + " hours used is: " + totalCharges + "$");
        }else
        {
            System.out.println("Enter the correct internet subscription package A, B or C!");
        }
    }
}
