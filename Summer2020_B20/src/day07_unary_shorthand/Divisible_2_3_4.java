package day07_unary_shorthand;

public class Divisible_2_3_4 {
    public static void main(String[] args){
        int num = 65;

        boolean two = num % 2 == 0;
        boolean thr = num % 3 == 0;
        boolean fiv = num % 5 == 0;

        System.out.println(num + " is divisible by 2: " + two);
        System.out.println(num + " is divisible by 3: " + thr);
        System.out.println(num + " is divisible by 5: " + fiv);
    }
}
