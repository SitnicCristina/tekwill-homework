package md.tekwill.homework2804;

/*it should calculate the perimeter for different shapes. It doesn't know for which shape it calculates the perimeter,
but knows different formulas based on the input parameters.

 */
public class PerimeterCalculator {
    public static void main(String[] args) {
        double trianglePerimeter = perimeter(1, 3, 5);
        System.out.println("The triangle perimeter is: " + trianglePerimeter);
    }

    static double perimeter(double a, double b, double c) {
        double perimeter;
        perimeter = a + b + c;
        return perimeter;
    }

    static double perimeter(double a, double l) {
        double perimeter;
        perimeter = 4 * a * (a - l);
        return perimeter;
    }

}
