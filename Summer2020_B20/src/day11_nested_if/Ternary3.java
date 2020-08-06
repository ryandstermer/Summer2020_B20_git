package day11_nested_if;

public class Ternary3 {
    public static void main(String[] args){
        int a = 30;
        int b = 30;

        String r = (a > b) ? a + " is greater" : (b > a) ? b + " is greater" : "they are equal";

        System.out.println(r);
    }
}
