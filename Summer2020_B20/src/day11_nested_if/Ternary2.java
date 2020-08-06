package day11_nested_if;

public class Ternary2 {
    public static void main(String[] args){
        int age = 18;
        String citizen = "USA";

        String canVote = (age >= 18 && citizen == "USA") ? "Yes you can vote!" : "No you can not vote.";
        String canDrink = (age >=21) ? "And go get a beer." : "But, grab some milk.";

        System.out.println(canVote + " " + canDrink);

        int x = 100;
        int y = 200;

        String result = (x == y) ? "Equal" : "Not Equal";
        System.out.println(result);
    }
}
