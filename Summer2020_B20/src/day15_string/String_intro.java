package day15_string;
import java.lang.String;
import java.util.Scanner;
public class String_intro {
    public static void main(String[] args){
        String str = "Cybertek";
        Scanner input = new Scanner(System.in);
        String name = new String("Ryan Stermer");

        String s1 = "Cat";
        String s2 = "Cat";

        System.out.println(s1 == s2);

        String t1 = new String("Tiger");
        String t2 = new String("Tiger");

        System.out.println(t1 == t2);

    }
}
