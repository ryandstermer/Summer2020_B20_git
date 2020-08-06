package day33_local_date_time;
import java.util.Arrays;
public class Calculate {
    public static void main(String[] args){
        int a = 10;
        double b = 20;

        System.out.println(addition(a, (int)b));

        System.out.println(addition(90, 5.5));

        int[] array1 = { 4, 3, 2, 1};
        Arrays.sort(array1);
        char[] array2 = {'C', 'B', 'A'};
        Arrays.sort(array2);
    }

    public static int addition(int a, int b){
        return a + b;
    }
    public static double addition(double a, double b){
        return a + b;
    }
    public static int multiplication(int a,  int b){
        return a * b;
    }
    public static double multiplication(double a, double b){
        return a * b;
    }
}
