package day22_nested_loop;

public class Nested_Loop2 {
    public static void main(String[] args){
        for(int j = 1; j <= 7; j++){

            for(int k = 1; k <= j; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j = 7; j >= 1; j--){

            for(int k = j; k >= 1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
