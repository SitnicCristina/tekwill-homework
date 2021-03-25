package md.tekwill.homework2503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneKeyPads {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter a letter: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String letter = reader.readLine();

        if( letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("c")){
            System.out.println("The corresponding number is 2");
        }else if(letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("f")){
            System.out.println("The corresponding number is 3");
        }else if(letter.equalsIgnoreCase("g") || letter.equalsIgnoreCase("h") || letter.equalsIgnoreCase("i")){
            System.out.println("The corresponding number is 4");
        }else if(letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("k") || letter.equalsIgnoreCase("l")){
            System.out.println("The corresponding number is 5");
        }else if(letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("n") || letter.equalsIgnoreCase("o")){
            System.out.println("The corresponding number is 6");
        }else if(letter.equalsIgnoreCase("p") || letter.equalsIgnoreCase("q") || letter.equalsIgnoreCase("r") || letter.equalsIgnoreCase("s")){
            System.out.println("The corresponding number is 7");
        }else if(letter.equalsIgnoreCase("t") || letter.equalsIgnoreCase("u") || letter.equalsIgnoreCase("v")){
            System.out.println("The corresponding number is 8");
        }else if(letter.equalsIgnoreCase("w") || letter.equalsIgnoreCase("x") || letter.equalsIgnoreCase("y") || letter.equalsIgnoreCase("z")){
            System.out.println("The corresponding number is 9");
        }else{
            System.out.println("Enter the correct letter");
        }
    }
}
