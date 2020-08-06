package day30_custom_methods;
import java.util.Arrays;

public class Return_Methods4 {
    public static void main(String[] args) {
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6, 7,};
    int[] array3 = combineArrays(array1, array2);
    System.out.println(Arrays.toString(array3));
    }

    public static int[] combineArrays ( int[] array1, int[] array2){
        int[] array3 = new int[array1.length + array2.length];

        int a = 0;
        for (int each : array1) {
                array3[a] = each;
                a++;
        }
        for (int each : array2) {
                array3[a] = each;
                a++;
        }
        return array3;
    }
}