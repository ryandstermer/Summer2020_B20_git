package day11_nested_if;

public class Number_To_Word {
    public static void main(String[] args){
        int input = 11;
        String output = "";

        if(input == 0){
            output = "zero";
        }else if(input == 1){
            output = "one";
        }else if(input == 2){
            output = "two";
        }else if(input == 3){
            output = "three";
        }else if(input == 4){
            output = "four";
        }else if(input == 5){
            output = "five";
        }else if(input == 6){
            output = "six";
        }else if(input == 7){
            output = "seven";
        }else if(input == 8){
            output = "eight";
        }else if(input == 9){
            output = "nine";
        }else{
            output = "invalid";
        }
        System.out.println(output);
    }
}
