package day21_loops;

public class Divide_Two_Numbers {
    public static void main(String[] args){
        int a = 15;
        int b = 3;

        int count = 0;

        if(b == 0){
            System.exit(0);
        }
        while(a >= b){
            a -= b;
            count++;
        }
        System.out.println(count + " with a remainder of " + a);
    }
}
