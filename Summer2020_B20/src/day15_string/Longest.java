package day15_string;
import java.util.Scanner;
public class Longest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two sentences");
        String sent1 = input.nextLine();
        String sent2 = input.nextLine();

        int length1 = sent1.length();
        int length2 = sent2.length();

        if(length1 > length2){
            System.out.println(sent1);
        }else{
            System.out.println(sent2);
        }
    }

}
