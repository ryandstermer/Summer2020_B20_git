package day24_arrays;
import java.util.Arrays;
public class Arrays_Utility {
    public static void main(String[] args){

        int[] cluster = {1,2,3};
        String chain = Arrays.toString(cluster);

        System.out.println(chain);

        String[] names = {"Tanglar", "Arros", "Theory", "Falkin"};
        String names1 = Arrays.toString(names);

        System.out.println(names1);

        int[] numbers = {8,7,6,5,4,3,2};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Maximum: " + numbers[numbers.length-1]);
        System.out.println("Minimum: " + numbers[0]);

        Arrays.sort(names);
        String pcs = Arrays.toString(names);
        System.out.println(pcs);

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result);
    }
}
