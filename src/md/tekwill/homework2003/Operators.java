package md.tekwill.homework2003;
/*5. What's the output of this program?
int a = 18;
int b = 22;
int c = 30;
System.out.println(++a > 18 || b++ < 10);
System.out.println(b-- > 30 && a++ <= 19);
System.out.println(c++ > a && a < b || c++ < 30);
System.out.println("a = " + a);
System.out.println("b = " + b);
System.out.println("c = " + c);
Which expressions will execute and which will not?
Aici la fel, încercați singuri să ajungeți la rezultat, și să scrieți în comentarii alături
de fiecare System.out.println care expresie este evaluată sau nu, și de ce*/

public class Operators {
    public static void main(String[] args){
        int a = 18;
        int b = 22;
        int c = 30;

        //                   19>18  ||  22<10
        //                   true   OR  false  = true
        //                    a=19      b=22 scurt circuit
        System.out.println(++a > 18 || b++ < 10);//true

        //                 22 > 30  &&  19<=19
        //                  false   AND true  = false
        //                   b=21       a=19 scurt circuit
        System.out.println(b-- > 30 && a++ <= 19);//false

        //                 30>19   && 19<21 || 31<30
        //                 true    AND true OR false = true
        //                 c=31  a=19  b=21    c=31  scurt circuit
        System.out.println(c++ > a && a < b || c++ < 30);//true

        //from previous statement a=19
        System.out.println("a = " + a);// a = 19
        System.out.println("b = " + b);//b = 21
        System.out.println("c = " + c);//c = 31
    }
}
