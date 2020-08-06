package day32_method_overloading;
import java.util.Scanner;
public class Format_Full_Name {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name and then your last name");
        String first = input.nextLine();
        String last = input.nextLine();

       String fullName = formatFullName(first, last);
        System.out.println(fullName);

    }
public static String formatFullName(String first, String last){
    first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
    last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

    String fullName = first + " " + last;

    return fullName;
}
}
