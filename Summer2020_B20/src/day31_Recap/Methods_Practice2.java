package day31_Recap;

public class Methods_Practice2 {
    public static void main(String[] args){
        String player1 = "Tanglar";
        System.out.println(uniqueCharacters(player1));
    }
    public static int frequencyOfCharacters(String str, char ch){
        int count = 0;
        for(char each: str.toCharArray()){
            if(each == ch){
                count++;
            }
        }
            return count;
    }
    public static String uniqueCharacters(String str){
        String uniques = "";
        for(char each: str.toCharArray()){
            int count = frequencyOfCharacters(str, each);
            if(count == 1){
                uniques += each;
            }
        }
            return uniques;
    }
}
