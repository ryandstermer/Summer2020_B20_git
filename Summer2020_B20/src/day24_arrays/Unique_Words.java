package day24_arrays;

public class Unique_Words {
    public static void main(String[] args){
        String[] chain = {"C#", "C#", "Java", "Python", "Python", "C++"};

        for(int i = 0;i <= chain.length-1; i++){
            String word = chain[i];
            int count = 0;

            for(int n = 0; n <= chain.length-1; n++){
                String each = chain[n];
                if(word.equals(each)){
                    count++;
                }
            }
        if(count == 1){
            System.out.println(word);
        }
        }
    }
}
