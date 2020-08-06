package day16_string;
import java.util.Scanner;
public class Substring_Practice1 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a word");
       String word = input.next();

       char first = word.charAt(0);
       char last = word.charAt(word.length() - 1);
       System.out.println(first == last);
   }
}
