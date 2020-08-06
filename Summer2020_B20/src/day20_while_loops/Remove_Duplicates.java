package day20_while_loops;
import java.util.Scanner;
public class Remove_Duplicates {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String result = "";

        for(int i = 0; i < str.length(); i++ ){
           String s = "" + str.charAt(i);

           if(result.contains(s)){
               continue;
           }
            result += s;
        }
        System.out.println(result);
    }
}
