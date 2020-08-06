package day38_Java_Recap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Collection_Utility {
    public static void main(String[] args){
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R', 'S', 'O', 'P', 'D', 'A', 'B', 'C'));
        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<String> players = new ArrayList<>();
        players.addAll(Arrays.asList("Milo", "Anne", "Fran", "Curd", "Yuntis", "Orumlir"));
        Collections.swap(players, 1, 2);
        System.out.println(players);

    }
}
