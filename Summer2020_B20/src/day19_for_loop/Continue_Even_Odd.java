package day19_for_loop;

public class Continue_Even_Odd {
    public static void main(String[] args){
        for(int i = 1; i <= 50; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
