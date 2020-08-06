package day13_scanner;

public class Browsers {
    public static void main(String[] args){

        String browserName = "Chrome";
        String output = "";

        switch(browserName){

            case "Chrome":
                output = "Chrome is opening";
                break;
            case "FireFox":
                output = "FireFox is opening";
                break;
            case "Opera":
                output = "Opera is an opening... I guess";
                break;
            case "Safari":
                output = "Safari is opening";
                break;
            case "Edge":
                output = "You can use Edge to download something better";
                break;
            default:
                output = "Invalid entry";
        }
            System.out.println(output);
    }
}
