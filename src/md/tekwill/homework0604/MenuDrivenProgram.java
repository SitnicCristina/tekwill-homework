package md.tekwill.homework0604;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Display the menu once
        System.out.println("Please enter one of the following choices:");
        System.out.println("c) carnivore\tp) pianist");
        System.out.println("t) tree\t\t\tg) game");

        boolean exitSelected = false;
        System.out.print("\nPlease enter c, p, t or g: ");
        do {
            String selectedOption = in.nextLine();
            System.out.print("\nPlease enter c, p, t or g: ");
            switch (selectedOption) {
                case "c":
                    System.out.println("The wolf is carnivore");
                    exitSelected = true;
                    break;
                case "p":
                    System.out.println("Frédéric Chopin is a pianist");
                    exitSelected = true;
                    break;
                case "t":
                    System.out.println("A maple is a tree");
                    exitSelected = true;
                    break;
                case "g":
                    System.out.println("The Mario is a game");
                    exitSelected = true;
                    break;
                default:
                    exitSelected = false;
            }
        } while (!exitSelected);
    }
}
