package day29_custom_methods;

public class Reverse {
    public static void main(String[] args){
        String chain = "Cyber";
        reverse(chain);
        System.out.println(chain);
    }
    public static void reverse(String chain){
        for(int i = chain.length()-1; i >= 0; i--){
            String output = "";
            output += i;
        }
    }
}
