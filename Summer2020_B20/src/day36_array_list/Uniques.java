package day36_array_list;
import java.util.ArrayList;
public class Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer each : list) {

            int count = 0;
            for (Integer every : list) {
                if (every == each) {
                    count++;
                }
                if (count == 1) {
                    uniques.add(each);
                }
            }
        }
            System.out.println(uniques);
    }
}