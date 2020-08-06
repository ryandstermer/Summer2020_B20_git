package day18_for_loop;
import java.util.Scanner;
public class Name_Loop {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        for( int i = 0; i < 5; i++){
            System.out.println(i);
        }
        for(int n = 0; n < 5; ++n ){
            System.out.println(n);
        }
        for(int t = 100; t >= 1; t--){
            System.out.print(t + " ");
        }
    }
}
