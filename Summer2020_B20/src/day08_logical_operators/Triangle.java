package day08_logical_operators;

public class Triangle {
    public static void main(String[] args){
        double angle1 = 200;
        double angle2 = 60;
        double angle3 = 20;

        double total = angle1 + angle2 + angle3;
        boolean triangle = total == 180;

        if(triangle == true){
            System.out.println("The triangle is valid.");
        }
        if(triangle != true){
            System.out.println("The triangle is invalid");
        }
    }
}
