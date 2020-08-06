package day24_arrays;

public class Unique_Numbers2 {
    public static void main(String[] args){
        int[] numerals = {1,1,2,3,3,4,5,5,6,7,7,8,9,9};

        for(int each: numerals){
            int count = 0;

            for(int other: numerals){
                if(other == each){
                    count++;
                }
            }
        if(count == 1){
            System.out.print(each + " ");
        }
        }
    }
}
