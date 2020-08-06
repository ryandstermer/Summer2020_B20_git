package day07_unary_shorthand;

public class Unary {
    public static void main(String[] args){
        System.out.println(-1 + -10);
        System.out.println(-1 - -10);
        System.out.println(-11 - -10);

        int a = 20;
        --a;
        System.out.println(a);

        int b = 10;
        ++b;
        System.out.println(b);

        int x = 100;
        System.out.println(--x);

        int y =100;
        System.out.println(++y);

        int z = 100;
        System.out.println(--z); // equals 99
        System.out.println(++z); // equals 100
    }
}
