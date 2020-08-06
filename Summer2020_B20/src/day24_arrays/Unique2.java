package day24_arrays;
import java.util.Scanner;
public class Unique2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chain = input.nextLine();
        String result = "";

        for (int i = 0; i <= chain.length() - 1; i++) {
            char figure1 = chain.charAt(i);
            int count1 = 0;

            for (int n = 0; n <= chain.length() - 1; n++) {
                char each = chain.charAt(n);
                if (figure1 == each) {
                    count1++;
                }
            }
            if (count1 == 1) {
                result += figure1;
            }
        }
        System.out.println(result);
    }
}