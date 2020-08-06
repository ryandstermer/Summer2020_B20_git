package day16_string;
import java.util.Scanner;
public class Substring_Practice3 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a string");
        String word = input.nextLine();
        int length = word.length();
        String output = "";

        if(length > 0) {
            if (length > 3) {
                output = word.substring(length - 3);
            } else {
                output = word.substring(0);
            }
        }else{
                output = "the string is empty";
        }
        System.out.println(output);
    }
}
