package day23_arrays;

public class Min_Max {
    public static void main(String[] args){

        int numb[] = {10, 20, 3, 4, 5, 6, 7,-10};
        int max = numb[0];
        int min = numb[0];

        for(int i = 0; i <= numb.length-1; i++){
            if(numb[i] > max){
                max = numb[i];
            }else if(numb[i] < min){
                min = numb[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
