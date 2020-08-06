package day12_switch_scanner;
import java.util.Scanner;
public class Rate_Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = input.nextDouble();
        System.out.println("How many hours do you work in a week?");
        int hours = input.nextInt();
        double hourRate = salary / (hours * 52);
        System.out.println("Your hourly rate is $" + hourRate);
    }
}
