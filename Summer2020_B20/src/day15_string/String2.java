package day15_string;
import java.util.Scanner;
public class String2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String firstName = scan.next();

        System.out.println("Enter your Last Name");
        String lastName = scan.next();

        String fullName = firstName.concat(" " + lastName);

        System.out.println(fullName);
    }
}
