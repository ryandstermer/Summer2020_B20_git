package day20_while_loops;

public class Branching_Statements {
    public static void main(String[] args){
        char ch = 'A';
        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
                continue;
            }
            System.out.print(ch + " ");
            ch++;
        }
        while(true){
            System.out.println("Test started");
            break;
        }
        System.out.println("Completed");
    }
}
