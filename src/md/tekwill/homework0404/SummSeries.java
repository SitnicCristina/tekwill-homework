package md.tekwill.homework0404;

public class SummSeries {
    public static void main(String[] args) {
        float summ = 0;
        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) {
                summ += i / (i + 2f);
                System.out.println(i + "/" + (i + 2));
            }
        }
        System.out.println(summ);
    }

}
