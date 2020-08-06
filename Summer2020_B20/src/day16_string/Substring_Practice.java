package day16_string;
import java.util.Scanner;
public class Substring_Practice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word =input.next();
        System.out.println("Enter second word");
        String word1 = input.next();

       /* word = word.substring(1);
        word1 = word1.substring(1); */

        String result = word.substring(1).concat(word1.substring(1));
        System.out.println(result);
    }
}
