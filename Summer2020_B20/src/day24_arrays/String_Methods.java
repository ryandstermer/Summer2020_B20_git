package day24_arrays;
import java.util.Arrays;
public class String_Methods {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJ";
        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean result1 = Arrays.equals(ch1, ch2);
        System.out.println(result1);

        String sentence = "I love Programming Language";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i] + " ");
        }

        String s = "JAVA";
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));

        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));
    }
}