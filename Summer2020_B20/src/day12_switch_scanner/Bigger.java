package day12_switch_scanner;

public class Bigger {
    public static void main(String[] args){
        int n1 = -2;
        int n2 = 2;
        int n3 = 1;

        String output = (n1 > n2 && n1 > n3) ? "n1 is bigger" : (n2 > n1 && n2 > n3) ? "n2 is bigger" : "n3 is bigger";
        System.out.println(output);
    }
}
