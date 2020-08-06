package day30_custom_methods;

public class Return_Methods2 {
    public static void main(String[] args){
        String chain = "Mareep";
        System.out.println(chain.equalsIgnoreCase(reverse(chain)));
    }
    public static String reverse(String chain){
        String result = "";
        for(int i = chain.length()-1; i >= 0; i--){
            result += chain.charAt(i);
        }
        return result;
    }
}
