package day29_custom_methods;
import java.util.Scanner;
public class Methods_With_Parameters {

    public static void printHello(int hello){
        for(int i = 0; i < hello; i++){
            System.out.println("Hello World");
        }
    }

    public static void age(int current, int birth){
        int age = current - birth;
        System.out.println(age);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello?");
        int hello = input.nextInt();

        printHello(hello);

        System.out.println("What is the current year?");
        int current = input.nextInt();
        System.out.println("What year were you born?");
        int birth = input.nextInt();
        if(current - birth >= 0){
            age(current,birth);
        }else{
            System.out.println("Invalid!");
            System.exit(0);
        }
    }
}
