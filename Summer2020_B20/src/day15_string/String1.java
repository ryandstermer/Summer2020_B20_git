package day15_string;
import java.util.Scanner;
public class String1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String firstName = input.next();
        char first = firstName.charAt(0);

        System.out.println("Enter your Last Name");
        String lastName = input.next();
        char last = lastName.charAt(0);

        System.out.println("Your initials are: " + first + "." + last + ".");

    }
}
