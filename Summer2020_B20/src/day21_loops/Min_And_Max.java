package day21_loops;
import java.util.Scanner;
public class Min_And_Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -999999999;
        int min =  999999999;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > max) {
                max = num;

            if(num < min){
                min = max;
            }
            }
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
