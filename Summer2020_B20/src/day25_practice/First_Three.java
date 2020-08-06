package day25_practice;

public class First_Three {
    public static void main(String[] args){
        String[] classes = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter"};

        for(String each : classes){
            System.out.println(each.substring(0,3));
        }
        System.out.println(" ");
        for(int i = 0; i <= classes.length-1; i++){
            System.out.println(classes[i].substring(0,3));
        }
    }
}
