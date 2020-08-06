package day24_arrays;
import java.util.Scanner;
public class Max_Min {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int count = input.nextInt();

        int[] numbers = new int[count];

        for(int i = 0; i <= count-1; i++){
            System.out.println("Enter a number");
            int num = input.nextInt();
            numbers[i] = num;
        }
        int max = numbers[0];
        for(int n = 0; n <= numbers.length-1; n++){
            if(numbers[n] > max){
                max = numbers[n];
            }
        }
        int min = numbers[0];
        for(int t = 0; t <= numbers.length-1; t++){
            if(numbers[t] < min){
                min = numbers[t];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
