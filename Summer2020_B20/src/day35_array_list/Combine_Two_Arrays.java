package day35_array_list;
import java.util.ArrayList;
public class Combine_Two_Arrays {
    public static void main(String[] args){
        String[] party1 = {"Mrs. Vile", "Megalon", "Thorondor", "Cairne", "Deckard"};
        String[] party2 = {"Peach", "Lotso", "Alicanto", "Waddles"};

        ArrayList<String> pokemonList = new ArrayList<>();

        for(String each: party1){
            pokemonList.add(each);
        }
        for(String each: party2){
            pokemonList.add(each);
        }
        System.out.println(pokemonList);
    }
}
