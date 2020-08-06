package day32_method_overloading;

public class Method_Overloading2 {
    public static void main(String[] args){
        addition2Numbers(10, 20);
        addition3Numbers(10, 20, 30);
        addition4Numbers(10, 20, 30, 40);
        addition(10,20);
        addition(10,20,30);
        addition(10,20,30,40);
    }
    public static void addition2Numbers(double a, double b){
        System.out.println(a + b);
    }
    public static void addition3Numbers(double a, double b, double c){
        System.out.println(a + b + c);
    }
    public static void addition4Numbers(double a, double b, double c, double d){
        System.out.println(a + b + c + d);
    }
    public static void addition(double a, double b){
        System.out.println(a + b);
    }
    public static void addition(double a, double b, double c){
        System.out.println(a + b + c);
    }
    public static void addition(double a, double b, double c, double d){
        System.out.println(a + b + c + d);
    }
}
