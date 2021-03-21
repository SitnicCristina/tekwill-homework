package md.tekwill.homework2003;
/*4. What's the result of given expression?
int a = 7;
int result = ++a - --a + a++ + ++a - a-- - --a - a++ + ++a;
What's the result of a after evaluating the expression?
Aici încercați să rezolvați singuri, și la tema pentru acasă să scrieți cum ați ajuns la rezultat, cum am făcut și la lecție.
*/

public class PrefixPostfixOperator {
    public static void main(String[] args){
       int a = 7;
       // result =  8   -  7    + 7   + 9   - 9  -7   - 7   + 9 = 3
        //         a=8    a=7   a=8   a=9   a=8  a=7   a=8  a=9
       int result = ++a - --a + a++ + ++a - a-- - --a - a++ + ++a;

       System.out.println("result = "+result + " a = " +a );
    }
}
