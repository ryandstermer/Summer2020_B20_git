package day13_scanner;
import java.util.Scanner;
public class Next_Line_VS_Next_Methods {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Salary");
        double salary = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your Name");
        String name = scan.nextLine();

        System.out.println("Your salary is : $" + salary);
        System.out.println("Your name is: " + name);

        scan.close();
    }
}
