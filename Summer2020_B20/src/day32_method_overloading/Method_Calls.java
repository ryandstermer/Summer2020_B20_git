package day32_method_overloading;
import Library.Util;
public class Method_Calls {
    public static void main(String[] args){

        String firstName = "tangLAR";
        String lastName = "brightROAR";

        String fullName;

        fullName = Util.formatFullName(firstName, lastName);
        System.out.println(fullName);

        String uniques = Util.uniques(fullName);
        System.out.println(uniques);


    }
}
