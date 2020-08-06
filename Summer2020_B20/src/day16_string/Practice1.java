package day16_string;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int first = input.nextInt();
        System.out.println("Enter your second number");
        int second = input.nextInt();
        System.out.println("Enter your operator");
        char operator = input.next().charAt(0);

        if(operator == '+'){
            System.out.println(first + second);
        }else if(operator == '-'){
            System.out.println(first - second);
        }else if(operator == '/'){
            System.out.println(first / second);
        }else if(operator == '*') {
            System.out.println(first * second);
        }else if(operator == '%'){
            System.out.println(first % second);
        }else{
           System.out.println("Incorrect Mathematical Operator");
        }

    }
}