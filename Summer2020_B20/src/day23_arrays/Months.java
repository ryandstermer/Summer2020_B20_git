package day23_arrays;
import java.util.Scanner;
public class Months {
    public static void main(String[] args){
        String month[] = new String[12];
        month[0] = "January";
        month[1] = "February";
        month[2] = "March";
        month[3] = "April";
        month[4] = "May";
        month[5] = "June";
        month[6] = "July";
        month[7] = "August";
        month[8] = "September";
        month[9] = "October";
        month[10] = "November";
        month[11] = "December";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12");
        int entry = input.nextInt();

        System.out.println(month[entry-1]);
    }
}
