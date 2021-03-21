package md.tekwill.homework2003;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 1 + 2;//3
        System.out.println(result);//3

        //rewrite result = result - 1;
        result -= 1;
        System.out.println(result);//3-1=2

       //rewrite result = result*2;
        result*=2;
        System.out.println(result);//2*2=4

        //rewrite result = result/2;
        result/=2;
        System.out.println(result);//4/2 =2

        //rewrite result = result + 8;
        result+=8;
        System.out.println(result);//2+8=10

        //rewrite result = result % 7;
        result %=7;
        System.out.println(result);//10%7=3
    }
}
