package md.tekwill.homework3003;

import java.util.Scanner;

/*3. Write a Java program which represent a simple arithmetic calculator. User will enter 3 parameters, the operator,
the first number and the second number.
Test Data
Input data:
operator: '+'
first number: 20
second number: 30
Expected output:
20 + 30 = 50
Another example -
operator: '/'
first number: 18
second number: 3
Expected output:
18 / 3 = 6;
Use a switch statement for this exercise and limit yourself to +, -, *, / operations
*/
public class Calculator {
    public static void main(String[] args) {
        //Enter the numbers and the operator
        System.out.println("Enter first number: ");
        Scanner in = new Scanner(System.in);
        int nbr1 = in.nextInt();
        System.out.println("Enter second number: ");
        int nbr2 = in.nextInt();
        System.out.println("Enter the operator: ");
        char operator = in.next().charAt(0);
        double result = 0;

        //calculate and print result
        switch (operator) {
            case '+':
                result = nbr1 + nbr2;
                break;
            case '-':
                result = nbr1 - nbr2;
                break;
            case '/':
                result = nbr1 / nbr2;
                break;
            case '*':
                result = nbr1 * nbr2;
                break;
            default:
                System.out.println("The program can't recognise the operator");
        }
        System.out.println("the result is: " + nbr1 + operator + nbr2 + "=" + result);

    }
}
