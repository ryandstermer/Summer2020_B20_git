package day16_string;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you employed?");
        String answer = scan.next();
        String output = "";

        if(answer.equalsIgnoreCase("yes")){
            output = "Employed";
        }else{
            output = "Not Employed";
        }
        System.out.println(output);
    }
}
