package day07_unary_shorthand;

public class Positive_Negative_0 {
    public static void main(String[] args){
        int num = 120;

        boolean posi = num > 0;
        boolean nega = num < 0;
        boolean zero = num == 0;

        System.out.println(num + " is positive?: " + posi);
        System.out.println(num + " is negative?: " + nega);
        System.out.println(num + " is zero?: " + zero);
    }
}
