package day12_switch_scanner;

public class Switch {
    public static void main(String[] args){

        int weekday = 5;
        String output = "";

        switch(weekday){

            case 1:
                output = "Monday";
                break;

            case 2:
                output = "Tuesday";
                break;

            case 3:
                output = "Wednesday";
                break;
            case 4:
                output = "Thursday";
                break;
            case 5:
                output = "Friday";
                break;
            case 6:
                output = "Saturday";
                break;
            case 7:
                output = "Sunday";
                break;

            default:
                output = "Invalid";
                break;
        }
            System.out.println(output);
    }
}
