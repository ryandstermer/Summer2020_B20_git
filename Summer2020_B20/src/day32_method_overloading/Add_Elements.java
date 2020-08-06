package day32_method_overloading;
import java.util.Arrays;
public class Add_Elements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int num1 = 4;

        int[] array2 = new int[array1.length + 1];
        array2[array2.length - 1] = num1;
        int i = 0;
        for (int each : array1) {
            array2[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(array2));
    }

    /*public static int[] addElement(int[] array1, int num1) {
        int[] array2 = new int[array1.length + 1];
        array2[array2.length - 1] = num1;
        int i = 0;
        for (int each : array1) {
            array2[i] = each;
            i++;

        }
    }*/
}