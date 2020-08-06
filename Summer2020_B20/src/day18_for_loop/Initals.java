package day18_for_loop;
import java.util.Scanner;
public class Initals {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String first = input.next();
        String last = input.next();

        String initial = first.substring(0,1) + last.substring(0,1);
        initial = initial.toUpperCase();

        System.out.println(initial);

        char ch1 = first.charAt(0);
        char ch2 = last.charAt(0);
        String ch3 = "" + ch1 + ch2;

        System.out.println(ch3);
    }
}
