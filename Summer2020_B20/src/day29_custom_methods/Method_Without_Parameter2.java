package day29_custom_methods;

public class Method_Without_Parameter2 {
    public static void main(String[] args) {
        printHelloWorld5X();
        System.out.println("Cybertek");
        printHelloWorld5X();
        System.out.println("Ryan");
        printHelloWorld5X();
    }

    public static void printHelloWorld5X() {
        for (int i = 10; i >= 6; i--) {
            System.out.println("Hello World");
        }
    }
}