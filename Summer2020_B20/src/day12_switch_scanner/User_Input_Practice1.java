package day12_switch_scanner;
import java.util.Scanner;
public class User_Input_Practice1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
           double num = scan.nextDouble();

        String result = (num %2 == 0) ? num + " Even" : num + " Odd";

        System.out.println(result);
    }
}
