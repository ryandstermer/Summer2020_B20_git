package day19_for_loop;

public class Characters_A_Z {
    public static void main(String[] args){
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("===================================================");
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("===================================================");
        for(char ch = 'z'; ch >= 'a'; ch--){
            System.out.print(ch + " ");
        }
    }
}
