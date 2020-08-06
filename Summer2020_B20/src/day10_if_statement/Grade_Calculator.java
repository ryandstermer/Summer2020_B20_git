package day10_if_statement;

public class Grade_Calculator {
    public static void main(String[] args){
        int score = 23;

        boolean A = score >= 90 && score <= 100;
        boolean B = score >= 80 && score <= 89;
        boolean C = score >= 70 && score <= 79;
        boolean D = score >= 60 && score <= 69;

        String result = "";

        if(A){
            result = "A";
        }else if(B){
            result = "B";
        }else if(C){
            result = "C";
        }else if(D){
            result = "D";
        }else{
            result = "F";
        }
        System.out.println("Your grade is a " + result);
    }
}
