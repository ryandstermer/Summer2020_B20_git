package day33_local_date_time;

public class Uniques {
    public static void main(String[] args) {
        int[] array1 = {2, 2, 1, 3, 3, 4};

        for (int element : array1) {
            int count = 0;
            for (int b : array1) {
                if (element == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }
        }
    }
}