package day26_multidimensional_array;
import java.util.Arrays;
public class Two_Dimensional_Array {
    public static void main(String[] args){
        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 5, 6};
        int[] num3 = {7, 8, 9};

        int[][] nums = {num1, num2, num3};

        System.out.println(Arrays.toString(nums[1]));
        System.out.println(nums[2][2]);
        System.out.println(nums[2][1] + " " + nums[0][1]);
        System.out.println(Arrays.toString(nums[2]));
    }
}
