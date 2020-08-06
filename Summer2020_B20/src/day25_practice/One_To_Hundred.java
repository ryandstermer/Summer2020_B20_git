package day25_practice;
import java.util.Arrays;
public class One_To_Hundred {
    public static void main(String[] args){
    int[] hundo = new int[100];

        for(int i = 0; i <= hundo.length-1; i++) {
            hundo[i] = i+1;
        }
        System.out.println(Arrays.toString(hundo));

        for(int each : hundo){
            if((each % 2 == 0)){
                continue;
            }else{
                System.out.print(each + " ");
            }
        }
    }
}
