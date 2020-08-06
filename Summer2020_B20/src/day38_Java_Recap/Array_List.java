package day38_Java_Recap;
import java.util.ArrayList;
import java.util.Arrays;
public class Array_List {
    public static void main(String[] args){
        ArrayList<String> pokemon = new ArrayList<>();
        pokemon.addAll(Arrays.asList("Machamp", "Grimmsnarl", "Houndoom", "Chandelure", "Skarmory", "Aggron", "Mammoswine"));

        //pokemon.remove(2);
        //pokemon.remove("Houndoom");
        //pokemon.removeAll(Arrays.asList("Houndoom"));
        //pokemon.removeIf(each -> each.toLowerCase().contains("m"));
        pokemon.retainAll(Arrays.asList("Machamp"));

        System.out.println(pokemon);

        System.out.println(" ");

        ArrayList<String> classes = new ArrayList<>();
        classes.addAll(Arrays.asList("Druid", "Cleric", "Bard", "Warlock", "Ranger"));

        boolean warrior = classes.contains("Fighter") || classes.contains("Barbarian");
        boolean healing = classes.containsAll(Arrays.asList("Cleric", "Druid", "Bard"));
        System.out.println(classes);
        System.out.println(warrior);
        System.out.println(healing);

        System.out.println("Total Number of Classes: " + classes.size());
        classes.set(classes.size()-1, "Monk");
        classes.set(classes.indexOf("Warlock") , "Fighter");
        System.out.println(classes);
        classes.clear();
        System.out.println(classes);

    }
}
