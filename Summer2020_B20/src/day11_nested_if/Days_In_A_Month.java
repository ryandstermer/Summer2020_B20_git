package day11_nested_if;

public class Days_In_A_Month {
    public static void main(String[] args){

        int month = 3;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean days31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean invalid = month < 1 || month > 12;

        String result = "";

        if(days28){
            result = "28 days";
        }else if(days30){
            result = "30 days";
        }else if(days31){
            result = "31 days";
        }else{
            result = "Invalid";
        }

        System.out.println(result);
    }
}
