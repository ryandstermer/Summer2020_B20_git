package day20_while_loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int enter = input.nextInt();
        int result = 1;

        for(int i = enter; i >= 1; i -= 1){
            result *= i;
        }
        System.out.println("The factorial of " + enter + " is " + result);
    }
}
