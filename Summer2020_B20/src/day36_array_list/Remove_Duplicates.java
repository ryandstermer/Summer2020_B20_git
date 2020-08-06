package day36_array_list;
import java.util.ArrayList;
import java.util.Arrays;
public class Remove_Duplicates {
    public static void main(String[] args){
        ArrayList<Character> list = new ArrayList<>();
            list.addAll(Arrays.asList('A', 'A', 'B', 'B', 'C', 'C'));

            System.out.println(list);

            ArrayList<Character> noDup = new ArrayList<>();
            for(Character each: list){
                if(!noDup.contains(each)){
                    noDup.add(each);
                }
            }
        System.out.println(noDup);
    }
}
