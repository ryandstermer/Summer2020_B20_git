package day22_nested_loop;
import java.util.Scanner;
public class Occurences_Of_Char {
    public static void main(String[] args){
        String str = "ababc";
        char ch = 'a';
        int count = 0;

        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);

            if(each == ch){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
