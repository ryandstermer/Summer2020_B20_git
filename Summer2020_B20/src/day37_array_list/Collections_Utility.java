package day37_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30, 20, 56, 78, 98, 100, 20, 0, -1, -3, 400, 500, 5000));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println(max + " " + min);
    }
}
