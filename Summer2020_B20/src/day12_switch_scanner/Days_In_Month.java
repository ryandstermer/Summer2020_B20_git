package day12_switch_scanner;

public class Days_In_Month {
    public static void main(String[] args){

        int month = 13;
        String output = "";

        switch(month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                output = "31 days";
                break;

            case 2:
                output = "28 days";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                output = "30 days";
                break;

            default:
                output = "Not a month!";
                break;
        }
            System.out.println(output);
    }
}
