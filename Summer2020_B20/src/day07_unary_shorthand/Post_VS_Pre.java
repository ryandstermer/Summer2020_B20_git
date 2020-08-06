package day07_unary_shorthand;

public class Post_VS_Pre {
    public static void main(String[] args){
        int a = 10;
        System.out.println(++a);
        System.out.println(a);  // the value changes immediately

        int b = 10;
        System.out.println(b++);
        System.out.println(b);  // the value doesn't change until AFTER it's printed

        int c = 25;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        System.out.println("-------------");

        int A = 1;
        A = -A-- + A++ / -A-- * --A;
        /*= -1 + 0 / -1 * -1
            -1 + 0 * -1
            -1 + 0
         */
        System.out.println(A);

        int B = 50;
        B= --B + B++ + B-- + B++;
        /* 49 + 49 + 50 + 49

         */
        System.out.println(B);

        int x = 4;
        int y = x * 4 - x++;
        //  y = 4 * 4 - 4
        System.out.println(y);
    }
}
