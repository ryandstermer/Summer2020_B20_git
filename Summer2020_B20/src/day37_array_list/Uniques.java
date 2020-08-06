package day37_array_list;
import java.util.ArrayList;
import java.util.Collections;
public class Uniques {
    public static void main(String[] args){
        String str = "AABBCDD";

        ArrayList<Character> list = new ArrayList<>();

        for(char each: str.toCharArray()){
            list.add(each);
        }
        System.out.println(list);

        int count = Collections.frequency(list, "A");
        System.out.println(count);

    }
}
