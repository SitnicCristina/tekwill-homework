package md.tekwill.homework0104;

//calculating the product of odd integers from 1 to 15. odd -> impare
public class OddInteger {
    public static void main(String[] args) {
        int summ = 0;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                summ += i;
            }
        }
        System.out.println("The product of odd integers 1 to 15 is: " + summ);
    }
}
