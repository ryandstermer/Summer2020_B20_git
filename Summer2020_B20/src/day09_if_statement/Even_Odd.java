package day09_if_statement;

public class Even_Odd {
    public static void main(String[] args){
        int a = 1;
        boolean even = a % 2 == 0;
        String result = "";

        if(even){
            result = "it is even";
        }else{
            result = "it is odd";
        }
        System.out.println(result);
    }
}
