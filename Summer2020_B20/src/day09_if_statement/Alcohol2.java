package day09_if_statement;

public class Alcohol2 {
    public static void main(String[] args){
        int age = 21;
        boolean hasID = false;

        boolean party = age >= 21 && hasID == true;

        if(party){
            System.out.println("Make sure it's a banger");
        }else{
            System.out.println("Go home kid.");
        }
    }
}
