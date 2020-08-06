package day35_array_list;

public class Sum_Of_Digits {
    public static void main(String[] args){
        String str = "a1b2c3";
        int sum = 0;

        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);
            if(each >= 48 && each <= 57){  // on the ascii table 48 - 57 are digits
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);
    }
}
