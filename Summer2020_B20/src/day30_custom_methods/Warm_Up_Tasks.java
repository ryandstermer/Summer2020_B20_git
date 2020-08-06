package day30_custom_methods;
import java.util.Arrays;
public class Warm_Up_Tasks {
    public static void main(String[] args){
        maxNum(1, 2);
        int vari[] = {5,2,3,4,5,6,7,0,-1,-54,-55,-5,54,-45,-45,-45};
        printDesc(vari);
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12,13,14,15};
        combineArrays(a1, a2);
        int[] a3 = {100, -100, -200, -300, 0, 0, 900, 5000};
        for(int each: a3){
            posNegZero(each);
        }

    }
    public static void maxNum(int i, int n){
        if(i == n){
            System.out.println("They are equal");
            return;
        }
        if(i > n){
            System.out.println(i + " is the maximum");
        }else{
            System.out.println(n + " is the maximum");
        }
    }
    public static void printDesc(int[] vari){
        Arrays.sort(vari);

        for(int t = vari.length-1; t >= 0; t--){
            System.out.print(vari[t] + " ");
        }
        System.out.println();
    }
    public static void combineArrays(int[] array1, int[] array2){
        int[] array3 = new int[array1.length + array2.length];

        int a = 0;
        for(int each: array1){
            array3[a] = each;
            a++;
        }
        for(int each: array2){
            array3[a] = each;
            a++;
        }
        System.out.println(Arrays.toString(array3));
    }
    public static void posNegZero(int num){
        if(num > 0){
            System.out.println(num + " is positive");
        }else if(num < 0 ){
            System.out.println(num + " is negative");
        }else{
            System.out.println(num + " is zero");
        }
    }
}
