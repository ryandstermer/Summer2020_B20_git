package day15_string;
import java.util.Scanner;
public class Sentence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = input.nextLine();

        char first = sentence.charAt(0);
        int length = sentence.length();
        char last = sentence.charAt(length - 1);

        System.out.println("The first letter is: " + first + '\n' + "The last letter is: " + last);
    }
}
