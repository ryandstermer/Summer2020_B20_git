package day35_array_list;
import java.util.ArrayList;
public class ArrayList_Method {
    public static void main(String[] args){
        ArrayList<String> topPokemon = new ArrayList<>();
        topPokemon.add("Machamp");
        topPokemon.add("Skarmory");
        topPokemon.add("Mammoswine");
        topPokemon.add("Aggron");
        topPokemon.add("Vaporeon");

        System.out.println(topPokemon);

        topPokemon.set(1, "Crobat");

        System.out.println(topPokemon);

        topPokemon.clear();

        System.out.println(topPokemon);
        System.out.println(topPokemon.size());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.remove(2);
        list.remove(3);

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        Integer a = 1;
        list2.remove(a);

        System.out.println(list2);
    }
}
