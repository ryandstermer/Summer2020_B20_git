package day36_array_list;
import java.util.ArrayList;
public class ArrayList_Method {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(40);

            int a = list.indexOf(40);

            System.out.println(a);
            System.out.println(list.lastIndexOf(40));

            boolean r1 = list.contains(100);
            System.out.println(r1);
    }
}
