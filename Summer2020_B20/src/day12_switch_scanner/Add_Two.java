package day12_switch_scanner;
import java.util.Scanner;
public class Add_Two {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        System.out.println("The result is " + (num1 + num2));
    }
}
