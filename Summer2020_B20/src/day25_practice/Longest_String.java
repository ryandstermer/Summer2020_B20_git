package day25_practice;

public class Longest_String {
    public static void main(String[] args){
        String[] names = {"Tanglar", "Arros", "Theory", "Falkin", "CRPA"};

        int max = names[0].length();

        for(String each : names){
            int length = each.length();
            if(length > max){
                max = length;
            }
        }
        for(String each : names){
            if(each.length() == max) {
                System.out.println(each);
            }
        }
    }
}
