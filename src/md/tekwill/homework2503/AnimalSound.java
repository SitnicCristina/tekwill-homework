package md.tekwill.homework2503;
/*4. Write a Java program that reads an animal from the user and prints the sound it makes.
Test data
Input animal: Wolf
Expected Output :
Howl
Input animal: Sheep
Expected Output :
Baaaa*/
import java.util.Scanner;

public class AnimalSound {
    public static void main(String[] args) {
        System.out.print("Enter the animal: ");
        Scanner in = new Scanner(System.in);
        String animalName = in.nextLine();

        if(animalName.contains("Wolf")){
            System.out.println("Howl");
        }else if(animalName.contains("Sheep")){
            System.out.println("Baaa");
        }else{
            System.out.println("Please enter the correct animal");
        }
    }
}
