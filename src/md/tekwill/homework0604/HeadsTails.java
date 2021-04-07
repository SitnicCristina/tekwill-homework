package md.tekwill.homework0604;

public class HeadsTails {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1000000; i++) {
            //convertt to int to display the int part of value 1 or 0
            int value = (int) (Math.random() * 2);
            if (value == 0)
                heads++;
            else tails++;
        }
        System.out.println("Flipping a coin one million times\nHeads: " +heads+"\tTails: "+tails);

    }
}
