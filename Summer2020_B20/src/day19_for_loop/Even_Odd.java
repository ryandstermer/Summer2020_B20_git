package day19_for_loop;

public class Even_Odd {
    public static void main(String[] args){
        for( int i = 1; i <= 100; i += 2){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    System.out.println();
    System.out.println("=====");
        for( int i = 0; i <= 100; i += 2){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
