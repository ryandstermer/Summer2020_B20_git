package day08_logical_operators;

public class Odd_Even {
    public static void main(String[] args){
        int number = 101;

        boolean even = number % 2 == 0;
        if(even == true){
            System.out.println("The number " + number + " is even.");
        }
        if(even != true){
            System.out.println("The number " + number + " is odd.");
        }
    }
}
