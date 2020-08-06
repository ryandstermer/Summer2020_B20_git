package day11_nested_if;

public class Nested_If2 {
    public static void main(String[] args){
        double salary = 30_000;
        String result = "";
        double jobHistory = 1;

        if(salary >= 30000){

            if(jobHistory >= 2){
                result = "You qualify!";
            }else{
                result = "You need more experience";
            }
        }else{
            result = "You must make at least 30k";
        }
        System.out.println(result);

        int month = 6;
        String days = "";


       if(month >= 1 || month <= 12){
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month ==10 || month == 12){
                days = "31";
            }else if(month == 4 || month == 6 || month == 9 || month == 11){
                days = "30";
            }else{
                days = "28";
            }
        }else{
            days = "Invalid month";
        }
        System.out.println(days);


            }
}
