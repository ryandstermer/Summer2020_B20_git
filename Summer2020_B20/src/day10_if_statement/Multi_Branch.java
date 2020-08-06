package day10_if_statement;

public class Multi_Branch {
    public static void main(String[] args){
        int number = 0;

        if(number > 0){
            System.out.println(number + " is positive");
        }
        if(number < 0){
            System.out.println(number + " is negative");
        }
        if(number == 0){
            System.out.println(number + " is zero");
        }

        if(number > 0){
            System.out.println("positive");
        }else if(number < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }





    }
}
