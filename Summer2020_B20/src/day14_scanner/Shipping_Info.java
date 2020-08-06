package day14_scanner;
import java.util.Scanner;
public class Shipping_Info {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you Building Number");
        String bldNum = scan.next();
        scan.nextLine();

        System.out.println("Enter your Street Address");
        String address = scan.nextLine();

        System.out.println("Enter your City");
        String city = scan.nextLine();

        System.out.println("Enter your State");
        String state = scan.nextLine();

        System.out.println("Enter your Zip Code");
        int zip = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your Full Name");
        String name = scan.nextLine();

        System.out.println(name +
                "\n" + bldNum + " " + address +
                "\n"+ city + ", " + state + " " + zip);

        scan.close();
    }
}
