package day23_arrays;
import java.util.Scanner;
public class Warm_Up1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 1;

        while(i != 0){
            System.out.println("Enter two numbers");
            int one = input.nextInt();
            int two = input.nextInt();
            int sum = one + two;
            System.out.println("The sum is " + sum);
            System.out.println("Do you want to continue?");
            String cont = input.next().toLowerCase();

            while(!(cont.equals("yes") || cont.equals("no"))){
                System.out.println("Invalid answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                cont = input.next().toLowerCase();
            }

            if(cont.equals("no")){
                i--;
            }
        }
    }
}
