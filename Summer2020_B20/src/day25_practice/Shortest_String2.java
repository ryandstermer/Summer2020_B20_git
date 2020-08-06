package day25_practice;

public class Shortest_String2 {
    public static void main(String[] args){
        String[] names = {"Ryan", "Andrew", "Colton", "Saim", "Jabari", "Elias", "Ricky"};

        int minLength = names[0].length();

        for(String each : names){
            int l = each.length();
            if(l < minLength){
                minLength = l;
            }
        }
        for(String each : names){
            if(each.length() == minLength){
                System.out.println(each);
            }
        }
    }
}
