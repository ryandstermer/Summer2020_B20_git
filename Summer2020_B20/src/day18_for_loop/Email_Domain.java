package day18_for_loop;
import java.util.Scanner;
public class Email_Domain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String email = input.next();
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");

        String domain = email.substring(index1+1, index2);
        System.out.println(domain);
    }
}
