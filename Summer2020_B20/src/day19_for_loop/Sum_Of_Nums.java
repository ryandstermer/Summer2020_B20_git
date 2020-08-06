package day19_for_loop;
import java.util.Scanner;
public class Sum_Of_Nums {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;

        if(num > 1){
            for(int i = 1; i <= num; i++){
                sum += i;
            }
        System.out.println(sum);
        }else{
            System.out.println("Invalid entry");
        }
    }
}
