package day19_for_loop;

public class Continue_Statement {
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
