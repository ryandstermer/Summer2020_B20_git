package day07_unary_shorthand;

public class Shorthand_Operators {
    public static void main(String[] args) {
        int a = 200;
        int b = 100;
        a += b;
        System.out.println(a);
        b -= 100;
        System.out.println(b);

        int c = 100;
        c *= c;
        System.out.println(c);

        String schoolName = "Cybertek";
        schoolName += " School";

        System.out.println(schoolName);

        String fullName = "Ryan";
        fullName += " Stermer";
        System.out.println(fullName);

        int budget = 100000;
        budget /= 2;
        System.out.println("The new budget is:" + budget);

        int num = 65;
        num %= 5;
        boolean divFiv = num == 0;
        System.out.println(divFiv);

        double num2 = 400.5;
        num2 %= 2;
        System.out.println(num2);
    }
}
