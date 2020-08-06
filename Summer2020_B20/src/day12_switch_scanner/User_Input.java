package day12_switch_scanner;
import java.util.Scanner;
public class User_Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            System.out.println("Enter your number");

            double num1 = input.nextDouble();

            System.out.println("You entered: " + num1);
    }
}
