package md.tekwill.homework0804;

public class Patterns {
    public static void main(String[] args) {
        int lenght = 4;
        int[][] array = new int[lenght][lenght];

        System.out.println("Pattern A:");
        for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                //select element position
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nPattern B:");
        for (int k = 0; k < lenght; k++) {
            for (int l = 0; l < lenght; l++) {
                //select element position
                if (k == lenght - (l + 1)) {
                    array[k][l] = 1;
                } else {
                    array[k][l] = 0;
                }
                System.out.print(array[k][l]);
            }
            System.out.println();
        }

        System.out.println("\nPattern C:");
        for (int m = 0; m < lenght; m++) {
            for (int n = 0; n < lenght; n++) {
                //select element position
                if ((m == 0 || m == lenght - 1) || (n == 0 || n == lenght - 1)) {
                    array[m][n] = 1;
                } else {
                    array[m][n] = 0;
                }
                System.out.print(array[m][n]);
            }
            System.out.println();
        }
    }
}
