package Library;
import Library.Util;
import java.util.*;
public class Util {
    public static String removeDup(String str){
        String nonDup = "";
        for( String each : str.split("") ){
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }
        return nonDup;
    }
    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1;  i >=0 ; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static int[] combineArrays ( int[] array1, int[] array2){
        int[] array3 = new int[array1.length + array2.length];

        int a = 0;
        for (int each : array1) {
            array3[a] = each;
            a++;
        }
        for (int each : array2) {
            array3[a] = each;
            a++;
        }
        return array3;
    }
    public static int frequency(String str, char ch){
        int count = 0;
        for(char each: str.toCharArray()){
            if(each == ch){
                count++;
            }
        }
        return count;
    }
    public static String uniques(String str){
        String uniques = "";
        for(char each: str.toCharArray()){
            int count = frequency(str, each);
            if(count == 1){
                uniques += each;
            }
        }
        return uniques;
    }
    public static String frequencyOfChars(String str){

        String expectedResult = "";
        String nonDup =    Util.removeDup(str);

        for(char each : nonDup.toCharArray() ){
            int count1 = Util.frequency(str, each);
            expectedResult +=   ""+ each + count1;
        }

        return expectedResult;
    }
    public static String formatFullName(String first, String last) {
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        String fullName = first + " " + last;

        return fullName;
    }

    public static int maximum(int[] arr){
        int max = arr[0];
        for( int each : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
    public static int minimum(int[] arr){
        int min= arr[0];
        for( int each : arr ){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
    public static int[] addElement(int[] arr, int num){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1] = num;

        int i =0;
        for(int each: arr){
            arr2[i]  = each;
            i++;
        }

        return arr2;
    }

    public static int[]  sortDesc(int[] arr){
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }


    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);

        double[] arr2 = new double[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }


    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }


    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }


}