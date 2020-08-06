package day14_scanner;
import java.util.Scanner;
public class Grade_Calculate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade");
        double grade = scan.nextDouble();
        boolean valid = grade >= 0 && grade <= 100;
        String output = "";

        if(valid){
            if(grade >= 90 && grade <= 100){
                output = "Excellent";
            }else if(grade >= 80){
                output = "Great";
            }else if(grade >= 70){
                output = "Good";
            }else if(grade >= 60){
                output = "Passed";
            }else{
                output = "Failed";
            }
        }else{
            output = "Not a valid grade";
        }
        System.out.println(output);

        scan.close();
    }
}
