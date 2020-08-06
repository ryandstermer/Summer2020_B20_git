package day08_logical_operators;

public class Logical_Operators {
    public static void main(String[] args){
        boolean r1 = 9 > 7;
        boolean r2 = !r1;

        System.out.println(r1 + " : " + r2);

        boolean r3 = !false == true;
        System.out.println(r3);

        boolean r4 = true == !true;
        System.out.println(r4);

        boolean r5 = 9 > 5 && 9 > 10;
        System.out.println(r5);

        boolean r6 = !true && false;

        boolean r7 = !false && 9>8;

        boolean r8 = true == !false || false == true;
        System.out.println("Or Logic: " + r8);
    }
}
