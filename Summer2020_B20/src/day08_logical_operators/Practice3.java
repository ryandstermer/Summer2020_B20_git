package day08_logical_operators;

public class Practice3 {
    public static void main(String[] args){
        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;

        int c = 5;
        boolean r2 = c++ == 6 || c-- == 5;

        boolean x = true;
        boolean z = true;
        int y = 20;
        x = (y!=10) || (z=false);

        System.out.println(x);

        boolean A = true;
        boolean B = !A;

        boolean C = A != B && A == !B && !A == B;
    }
}
