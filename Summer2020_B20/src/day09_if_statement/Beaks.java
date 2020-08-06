package day09_if_statement;

public class Beaks {
    public static void main(String[] args){
        
        boolean breakTime = true;
        String result = "";

        if(breakTime){
            result = "Take a 15 minute break.";
        }else{
            result = "Continue the class";
        }
        System.out.println(result);
    }
}
