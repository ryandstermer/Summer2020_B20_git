package day23_arrays;
import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        for(int i = 0; i <= days.length-1; i++){
            System.out.print(days[i] + " ");
        }
        System.out.println();
        System.out.println("Enter a number 1 ~ 7");
        int entry = input.nextInt();
        System.out.println(days[entry-1]);
    }
}
