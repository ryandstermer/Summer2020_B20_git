package day32_method_overloading;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = input.nextDouble();
        System.out.println("Enter the operator");
        char operator = input.next().charAt(0);
        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        double result = calculator(num1, operator, num2);
        System.out.println(result);
    }
    public static double calculator(double num1, char operator, double num2){
        double result = (operator == '+')? num1 + num2:(operator == '-')? num1 - num2:(operator == '*')? num1 * num2:(operator == '/')? num1 / num2:(operator == '%') ? num1 % num2: 0;
        return result;
    }
}
