package day11_nested_if;

public class Ternary_PosiNegaZero {
    public static void main(String[] args){
        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        }else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);

        String result2 = (num > 0) ? "Positive" : (num < 0 ) ? "Negative" : "Zero";
        System.out.println(result2);
    }
}
