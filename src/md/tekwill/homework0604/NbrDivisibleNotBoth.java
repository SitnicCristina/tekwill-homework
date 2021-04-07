package md.tekwill.homework0604;

public class NbrDivisibleNotBoth {
    public static void main(String[] args) {
        int from = 100;
        int to = 200;
        int k = 0;

        do {
            if (from % 5 == 0 || from % 6 == 0) {
                System.out.print(from + " ");
                k++;
            }
            //print ten per line
            if (k == 10) {
                System.out.println();
                k=0;
            }
            //take next number to check
            from++;
        } while (from <= to);
    }
}
