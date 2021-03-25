package md.tekwill.homework2503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneKeyPads {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a letter: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String letter = reader.readLine();

        if( letter.equals("a") || letter.equals("A") || letter.equals("b") || letter.equals("B") || letter.equals("c") || letter.equals("C")){
            System.out.println("The corresponding number is 2");
        }else if(letter.equals("d") || letter.equals("D") || letter.equals("e") || letter.equals("E") || letter.equals("f") || letter.equals("F")){
            System.out.println("The corresponding number is 3");
        }else if(letter.equals("g") || letter.equals("G") || letter.equals("h") || letter.equals("H") || letter.equals("i") || letter.equals("I")){
            System.out.println("The corresponding number is 4");
        }else if(letter.equals("j") || letter.equals("J") || letter.equals("k") || letter.equals("K") || letter.equals("l") || letter.equals("L")){
            System.out.println("The corresponding number is 5");
        }else if(letter.equals("m") || letter.equals("M") || letter.equals("n") || letter.equals("N") || letter.equals("o") || letter.equals("O")){
            System.out.println("The corresponding number is 6");
        }else if(letter.equals("p") || letter.equals("P") || letter.equals("q") || letter.equals("Q") || letter.equals("r") || letter.equals("R")|| letter.equals("s") || letter.equals("S")){
            System.out.println("The corresponding number is 7");
        }else if(letter.equals("t") || letter.equals("T") || letter.equals("u") || letter.equals("U") || letter.equals("v") || letter.equals("V")){
            System.out.println("The corresponding number is 8");
        }else if(letter.equals("w") || letter.equals("W") || letter.equals("x") || letter.equals("X") || letter.equals("y") || letter.equals("Y")|| letter.equals("z") || letter.equals("Z")){
            System.out.println("The corresponding number is 9");
        }else{
            System.out.println("Enter the correct letter");
        }
    }
}
