package md.tekwill.homework0104;

//write a program that display the multiplication table. The program should ask the user to enter the number
//and also the range up to witch the user wants to display the multiplication table
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Ask the user to enter the number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int nbr = in.nextInt();
        //Ask the user to enter the range number to display the multiplication table
        System.out.print("\nEnter the range number to multiplicative : ");
        int rangeNbr = in.nextInt();

        int multipResult = 0;

        for (int i = 1; i<=rangeNbr; i++){
            multipResult = nbr * i;
            System.out.println(nbr + " * " + i + " = " + multipResult);
        }
    }
}
