package day12_switch_scanner;

public class Switch_Practice {
    public static void main(String[] args){
        String productName = "iPhone";

        switch(productName){
            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "iPhone":
                case "MacBook":
            case "iPad":
                System.out.println("Apple");
                break;

            default:
                System.out.println("Product Not Found");
                break;
        }
    }
}
