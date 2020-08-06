package day19_for_loop;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");

        String str = input.next();
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
        }
    }

