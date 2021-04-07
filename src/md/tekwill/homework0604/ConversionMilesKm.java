package md.tekwill.homework0604;

public class ConversionMilesKm {
    public static void main(String[] args) {
        int n = 1;
        System.out.println("Miles\tKilometers");
        do{
            System.out.println(n +"\t\t" + n*1.609);
            n++;
        }while(n <= 10);
    }
}
