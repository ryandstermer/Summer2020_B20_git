package day24_arrays;

public class Unique {
    public static void main(String[] args){
        String chain = "aabccd";
        String unique = "";

        for(int i = 0; i <= chain.length()-1; i++){
            char figure = chain.charAt(i);
            int first = chain.indexOf(figure);
            int last = chain.lastIndexOf(figure);
            if(first == last){
                unique += figure + "";
            }
        }
        System.out.println(unique);
    }
}
