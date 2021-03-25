package md.tekwill.homework2503;

import java.util.Scanner;

//I, II, III, IV, V, VI, VII, VIII, IX, X,
public class RomanNumeral {
    public static void main(String[] args) {
        System.out.println("Enter a number within the range 1 to 10: ");
        Scanner in = new Scanner(System.in);
        int nbr = in.nextInt();

        if(nbr == 1){
            System.out.println("The Roman version of "+ nbr + " is I");
        }else if(nbr == 2){
            System.out.println("The Roman version of "+ nbr + " is II");
        }else if(nbr == 3){
            System.out.println("The Roman version of "+ nbr + " is III");
        }else if(nbr == 4){
            System.out.println("The Roman version of "+ nbr + " is IV");
        }else if(nbr == 5){
            System.out.println("The Roman version of "+ nbr + " is V");
        }else if(nbr == 6){
            System.out.println("The Roman version of "+ nbr + " is VI");
        }else if(nbr == 7){
            System.out.println("The Roman version of "+ nbr + " is VII");
        }else if(nbr == 8){
            System.out.println("The Roman version of "+ nbr + " is VIII");
        }else if(nbr == 9){
            System.out.println("The Roman version of "+ nbr + " is IX");
        }else if(nbr == 10){
            System.out.println("The Roman version of "+ nbr + " is X");
        }else{
            System.out.println("Enter the correct number within the range 1 to 10");
        }
    }
}
