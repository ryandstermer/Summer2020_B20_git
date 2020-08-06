package day14_scanner;
import java.util.Scanner;
public class Scanner_Number_Words {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        boolean valid = num >= 0 && num <= 9;
        String output = "";

        if(valid){
            if(num == 1){
                output = "One";
            }else if(num == 2){
                output = "Two";
            }else if(num == 3){
                output = "Three";
            }else if(num == 4){
                output = "Four";
            }else if(num == 5){
                output = "Five";
            }else if(num == 6){
                output = "Six";
            }else if(num == 7){
                output = "Seven";
            }else if(num == 8){
                output = "Eight";
            }else{
                output = "Nine";
            }
        }else{
            output = "Not valid";
        }
        System.out.println(output);

        scan.close();
    }
}
