package day22_nested_loop;
import java.util.Scanner;
public class Upper_Lower {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = input.nextLine();

        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);

        boolean start = first >= 'A' && first <= 'Z';
        boolean end = last >= 'a' && last <= 'z';

        if(start && end){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
