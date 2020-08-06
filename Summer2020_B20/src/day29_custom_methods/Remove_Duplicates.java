package day29_custom_methods;

public class Remove_Duplicates {
    public static void main(String[] args){
        String str = "strstrstsrtsrstsrstsrtsrsts";

        removeDup(str);
    }
    public static void removeDup(String str){
        String noDup = "";

        for(String each :str.split("")){
            if(!noDup.contains(each)){
                noDup += each;
            }
        }
    System.out.println(noDup);
    }
}
