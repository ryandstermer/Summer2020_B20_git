package day16_string;
import java.util.Scanner;
public class Substring_Practice4 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter three words");
       String output = "";

       String word = input.next();
       String word1 = input.next();
       String word2 = input.next();

       if(word.length() == word1.length() && word1.length() == word2.length()){
           output = "All words are the same length";
       }else if(word.length() != word1.length() && word1.length() != word2.length()){
           output = "All words are different lengths";
       }else{
           output = "The words are both different and the same lengths";
       }
    System.out.println(output);
   }
}
