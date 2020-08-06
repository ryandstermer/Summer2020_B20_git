package day13_scanner;
import java.util.Scanner;
public class Next_Line {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");

        String fullName = scan.nextLine();
        System.out.println(fullName);
    }
}
