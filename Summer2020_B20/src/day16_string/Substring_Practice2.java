package day16_string;

public class Substring_Practice2 {
    public static void main(String[] args){
        String str = "I like to drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);

        String action = str.substring(10,15);
        System.out.println(action);
    }
}
