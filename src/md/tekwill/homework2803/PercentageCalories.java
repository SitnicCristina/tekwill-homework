package md.tekwill.homework2803;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PercentageCalories {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        //the user enter the fat grams and calories
        System.out.print("Enter the fat grams: ");
        Scanner in = new Scanner(System.in);
        int fatGrams = in.nextInt();
        System.out.print("\nEnter the number of calories: ");
        int nrCalories = in.nextInt();

        //calculate the percentage
        double caloriesFromFat = fatGrams * 9;
        double percentCalFromFat = caloriesFromFat / nrCalories;
        System.out.println("The percent of the calories that come from fat is: " + df2.format(percentCalFromFat) + "%");

        //If the calories from fat are less than 30 percent of the total calories of the food than the food is low in fat
        if (caloriesFromFat < ((nrCalories * 30.0) / 100)) {
            System.out.println("The food is low in fat");
        }
    }
}

