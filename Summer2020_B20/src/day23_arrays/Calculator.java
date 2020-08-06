package day23_arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 1;

        while(i != 0){
            System.out.println("Enter two numbers");
            double one = input.nextDouble();
            double two = input.nextDouble();
            System.out.println("Enter the mathematical operator");
            char operator = input.next().charAt(0);

            double result = (operator == '+')? one + two: (operator == '-')? one - two:
                    (operator == '*')? one * two: (operator == '/')? one / two:
                            (operator == '%')? one % two: -0.8008135;

            if(result == -0.8008135){
                System.out.println("Wrong operator");
            }else{
                System.out.println("The result is " + result);
            }

            System.out.println("Do you want to continue?");
            String cont = input.next().toLowerCase();

            while(!(cont.equals("yes") || cont.equals("no"))){
                System.out.println("Invalid answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                cont = input.next().toLowerCase();
            }

            if(cont.equals("no")){
                i--;
            }
        }
    }
}

