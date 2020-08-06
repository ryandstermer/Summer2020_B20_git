package day27_28_recap;

public class Frequency_of_Array {
    public static void main(String[] args){

        String[] arr = {"Java", "C#", "Python", "Java"};
        String word = "Java";

        int count = 0;

        for(String each: arr){
            if(!word.equalsIgnoreCase(each)){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
