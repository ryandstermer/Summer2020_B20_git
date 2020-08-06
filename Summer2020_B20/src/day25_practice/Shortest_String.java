package day25_practice;

public class Shortest_String {
    public static void main(String[] args){
        String[] names = {"Anam", "Nickolas", "Amir", "Nuremet"};

        int minLength = names[0].length();

        for(int i = 0; i <= names.length-1; i++){
            if(names[i].length() < minLength){
                minLength = names[i].length();
            }
        }
        for(int i = 0; i <= names.length-1; i++){
            if(names[i].length() == minLength){
                System.out.println(names[i]);
            }
        }
    }
}
