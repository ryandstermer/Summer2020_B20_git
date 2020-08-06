package day08_logical_operators;

public class Warm_Up {
    public static void main(String[] args){
        double num = 15;
        double liter = num * 3.785;

        System.out.println(num + " gallon(s) is equal to " + liter + " liter(s)");

        double num2 = 1000;
        double gallon = num2 / 3.785;

        System.out.println(num2 + " liter(s) is equal to " + gallon + " gallon(s)");

        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //      -200 + -200 * 200 % 2
        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        /*    300 + 400 - 300 * 400 + 300 / 400
              300 + 400 - 120000 + (.75) ignored because it's an integer
         */
        System.out.println(z);
    }
}
