package md.tekwill.homework0404;

public class DisplayFourPatterns {
    public static void main(String[] args) {
        /* Pattern A
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        */
        System.out.println("Pattern A: ");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /* Pattern B
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */
        System.out.println("\nPattern B: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /* Pattern C
                  1
                2 1
              3 2 1
            4 3 2 1
          5 4 3 2 1
        6 5 4 3 2 1
        */
        System.out.println("\nPattern C: ");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        /*
        /* Pattern D
        1 2 3 4 5 6
          1 2 3 4 5
            1 2 3 4
              1 2 3
                1 2
                  1
         */
        System.out.println("\nPattern D: ");
        for (int i = 0; i < 6; i++) {
            for (int k = i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
