package day21_loops;

public class Do_While_Practice {
    public static void main(String[] args){
        int num = 1;

        do{
            System.out.print(num + " ");
            num++;
        }while(num <= 20);
        System.out.println();

        System.out.println(num);

        char ch = 'Z';
        do{
           System.out.print(ch + " ");
            ch--;
        }while(ch >= 'A');
    }
}
