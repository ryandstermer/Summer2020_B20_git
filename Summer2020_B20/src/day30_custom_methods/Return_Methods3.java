package day30_custom_methods;
import java.util.Arrays;
public class Return_Methods3 {
    public static void main(String[] args){
        int[] array1 = {6,4,8,2,9,3,1,5,7};
        int max = max(array1);
        System.out.println(max);
    }
    public static int max(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
}
