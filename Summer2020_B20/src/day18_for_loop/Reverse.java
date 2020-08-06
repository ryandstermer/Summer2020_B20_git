package day18_for_loop;

public class Reverse {
    public static void main(String[] args){
        String str = "Java";
        String s1 = str.substring(1);
        String s2 = str.substring(0,1);
        String result = s1 + s2;
        System.out.println(result);
    }
}
