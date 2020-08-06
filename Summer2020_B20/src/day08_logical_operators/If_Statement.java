package day08_logical_operators;

public class If_Statement {
    public static void main(String[] args){
        int a = 2000;
        int b = 2000;

        if(a > b) {
            System.out.println(a + " is larger than " + b);
        }
        if(b > a) {
            System.out.println(b + " is larger than " + a);
        }
        if(a == b) {
            System.out.println(a + " is equal to " + b);
        }

        boolean breakTime = true;
        if(breakTime == true){
            System.out.println("Take 15 minute break!");
        }
        if(breakTime != true){
            System.out.println("Keep Studying");
        }


        boolean Corona = true;
        if(Corona == true){
            System.out.println("Buy more toliet paper.");
            System.out.println("Practice social distancing.");
            System.out.println("Wash your hands more.");
        }
        if(Corona != true){
            System.out.println("You should still wash your hands more.");
        }
    }
}
