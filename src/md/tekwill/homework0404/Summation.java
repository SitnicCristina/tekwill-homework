package md.tekwill.homework0404;

public class Summation {
    public static void main(String[] args) {
        float summ = 0;
        for (int i = 0; i < 624; i++) {
            summ += 1f / ((Math.sqrt(1 + i) + Math.sqrt(2 + i)));
            System.out.println("1/sqrt(" + (1 + i) + ")+sqrt(" + (2 + i) + ")");
        }
        System.out.println(summ);
    }
}
