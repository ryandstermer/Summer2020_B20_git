package day15_string;

public class Substring_Method {
    public static void main(String[] args){
        String sentence = "Java is fun";
        //                 012345678910

        String word = sentence.substring(0,4);
        System.out.println(word);

        String word1 = sentence.substring(8,11);
        System.out.println(word1);

        String sentence1 = "I like Movies and TV Series";
        String word2 = sentence1.substring(7,12+1);
        System.out.println(word2);

        String firstName = "MUHTAR";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1,firstName.length());
         firstName = firstCharacter.toUpperCase() + rest.toLowerCase();

         System.out.println(firstName);
    }
}
