package day35_array_list;
import java.util.ArrayList;

public class Reversed_Order {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1, 30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for(int i = 4; i >= 0; i--){
            System.out.print(list.get(i)+ " ");
        }
    }

}
