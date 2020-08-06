package day33_local_date_time;
import java.util.Arrays;
public class Sort_Descending {

    public static void main(String[] args){
        int[] array1 = {1, 4, 3, 2, 5};
        Arrays.sort(array1); // {1, 2, 3, 4, 5}
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[array1.length];

        /*array2[0] = array1[array1.length-1];
        array2[1] = array1[3];
        array2[2] = array1[2];
        array2[3] = array1[1];
        array2[4] = array1[0];*/

        int[] scores = {100, 75, 85, 95, 65, 55};
        scores = sortDesc(scores);
        System.out.println(Arrays.toString(scores));

        double[] n1 = {5.5, 6.5, 2.5, 3.5, 1.5, 0.5};
        n1 = sortDesc(n1);
        System.out.println(Arrays.toString(n1));

    }
    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
    }
        return arr2;
}
    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);
        double[] arr2 = new double[arr.length];
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);
        char[] arr2 = new char[arr.length];
        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }
}