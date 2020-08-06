package day27_28_recap;
import java.util.Arrays;
public class MultiDimensional_Array {
    public static void main(String[] args){
        int[][] arr2d = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};

        System.out.println(Arrays.toString(arr2d[1]));
        System.out.println(Arrays.deepToString(arr2d));

        System.out.println(arr2d[1][3]);

        for(int i = 0; i <= arr2d.length-1; i++){
            int[] each1DArray = arr2d[i];
            for(int n = 0; n <= each1DArray[n]; n++){
                int eachNum = each1DArray[n];
                if(eachNum %2 == 0){
                    System.out.print(eachNum + " ");
                }
            }
            System.out.println();
        }
    }
}
