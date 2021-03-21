package md.tekwill.homework2003;
/*In this class, declare a variable named 'intValue' of data type int that is assigned value 50.
secondly, declare a variable named 'doubleValue' of data type double that is assigned the value of 30.2.
Create a third variable, named 'sumOfIntAndDouble' which is the sum of the intValue variable and doubleValue variable.
What would be the data type of sumOfIntAndDouble? Add a comment to explain why is this happening.*/

public class DeclareDatatype {
    public static void main(String[] args) {
        int intValue = 50;
        double doubleValue = 30.2;
        double sumOfIntAndDouble = intValue + doubleValue;//the result of summ int+double will result a double.
        System.out.println(sumOfIntAndDouble);
    }
}
