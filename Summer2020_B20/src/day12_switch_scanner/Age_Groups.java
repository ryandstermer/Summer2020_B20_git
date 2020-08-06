package day12_switch_scanner;

public class Age_Groups {
    public static void main(String[] args){
        int age = 40;
        boolean accept = age >= 0 && age <= 150;
        String output = "";

        if(accept){
            if(age < 21){
                output = "Teenager";
            }else if(age >= 21 && age < 55){
                output = "Adult";
            }else{
                output = "Senior";
            }
        }else{
            output = "Unacceptable value";
        }
        System.out.println(output);
    }
}
