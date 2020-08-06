package day06;

public class Swap2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        // a to equal 15 and b to equal 10

        System.out.println(a + b % a);
        System.out.println(a + b % b);
        // ???

        a = a + b; // a now equals 25
        b = a - b; // b now equals 10
        a = a - b; // a now equals 15

        System.out.println(a);
        System.out.println(b);
    }
}
