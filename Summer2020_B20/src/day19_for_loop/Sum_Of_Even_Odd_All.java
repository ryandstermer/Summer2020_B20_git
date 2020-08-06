package day19_for_loop;

public class Sum_Of_Even_Odd_All {
    public static void main(String[] args){
        int n = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                n += i;
            }
        }
    System.out.println(n);
    System.out.println("=====");
        int t = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                t += i;
            }
        }
    System.out.println(t);
    System.out.println("=====");
        int r = 0;
        for(int i = 1; i <= 100; i++){
            r += i;
        }
    System.out.println(r);
    }
}
