package md.tekwill.datatypes.charprimitive;

public class ExampleCharPrimitive {

    public static void main(String[] arg){
        char foo = 'A';
        //char foo = "A";//wrong
        char specialChar1 = '\u0135';
        char specialChar2 = 0135;
        System.out.println("char1 = " + specialChar1);
        System.out.println("char2 = " + specialChar2);
    }
}
