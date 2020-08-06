package day27_28_recap;
import java.util.Scanner;
public class Frequency_of_Word2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String word = input.next();
        int l = word.length();

        int count = 0;
        for (int i = 0; i <= str.length() - l; i++) {
            if (str.substring(i, i + l).equalsIgnoreCase(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}