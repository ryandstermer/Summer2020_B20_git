package day09_if_statement;

public class Vote {
    public static void main(String[] args){

        int age = 7;
        String citizen = "USA";

        boolean eligible = age >=18 && citizen == "USA";

        if(eligible){
            System.out.println("Can vote.");
        }else{
            System.out.println("Can NOT vote.");
        }
    }
}
