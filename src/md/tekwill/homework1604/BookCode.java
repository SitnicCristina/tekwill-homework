package md.tekwill.homework1604;

import java.util.Scanner;

public class BookCode {
    public static void main(String[] args) {
        System.out.print("Enter the first 12 digits of am ISBN-13 as a string: ");
        Scanner in = new Scanner(System.in);
        String inputNumber = in.nextLine();

        if(inputNumber.length()!=12){
            System.out.println(inputNumber + " is an invalid input");
        }else {
            //convert String->char and get each of element after save the converted char to int in array
            int d[] = new int[12];
            for (int i = 0; i < inputNumber.length(); i++) {
                char c = inputNumber.charAt(i);
                d[i] = Character.getNumericValue(c);
            }
            //calculate the checksum element ex: 978013213080 -> 9780132130806; 978013213079->9780132130790
            int checksum = 0;
            checksum = 10 - (d[0] + 3 * d[1] + d[2] + 3 * d[3] + d[4] + 3 * d[5] + d[6] + 3 * d[7] + d[8] + 3 * d[9] + d[10] + 3 * d[11]) % 10;

            //if the checksum is 10 replace it with 0
            if (checksum == 10) {
                checksum = 0;
            }

            //output the result
            System.out.println("The ISBN-13 number is " + inputNumber + checksum);
        }

    }
}
