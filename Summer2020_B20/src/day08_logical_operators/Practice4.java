package day08_logical_operators;

public class Practice4 {
    public static void main(String[] args){
        double num1 =20;
        double num2 = 80;
        double result = (num1 + num2) * 24;
        double remainder = result % 40;
        boolean remain = remainder <= 20;

        System.out.println(remain);
    }
}
