package day20_while_loops;
import java.util.Scanner;
public class While_Loop_Practice3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String password = "Cybertek123";
        System.out.println("Enter your password");
        String enter = input.nextLine();

        while(!enter.equals(password)){
            System.out.println("Incorrect password");
            System.out.println("Enter your password");
            enter = input.nextLine();
        }
        System.out.println("Logged in");
    }
}
