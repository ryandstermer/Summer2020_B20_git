package day09_if_statement;

public class Warm_Up {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 21;
        int num3 = 13;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest.");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest.");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the largest.");
        }


        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is the smallest.");
        }
        if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " is the smallest.");
        }
        if (num3 < num1 && num3 < num2) {
            System.out.println(num3 + " is the smallest.");
        }


        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            System.out.println(num1 + " is the median.");
        }
        if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            System.out.println(num2 + " is the median.");
        }
        if ((num3 > num2 && num3 < num1) || (num3 < num2 && num3 > num1)) {
            System.out.println(num1 + " is the median.");
        }

        String result = "";
        int age = 22;
        boolean hasID = false;

        boolean eligible = (age >= 21 && hasID == true);

        if (eligible == true) {
           result = "Buy some alcohol.";
        }
        if(eligible == false) {
            result = "Go get MILK.";
        }
        System.out.println(result);
    }
}
