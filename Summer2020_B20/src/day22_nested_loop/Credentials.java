package day22_nested_loop;
import java.util.Scanner;
public class Credentials {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String user = input.next();
        System.out.println("Enter your password");
        String password = input.next();
        int attempt = 0;

       while(!(user.equals("cyber") && password.equals("tek123"))){
           if(attempt > 3){
               System.out.println("Your account is locked");
               System.exit(0);
           }
           System.out.println("Invalid username or password");
           System.out.println("Please re-enter");

           System.out.println("Enter your username");
           user = input.next();
           System.out.println("Enter your password");
           password = input.next();
           attempt++;
       }


        System.out.println("Logged on");
    }
}
