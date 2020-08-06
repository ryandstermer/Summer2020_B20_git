package day29_custom_methods;

public class Uniques {
    public static void main(String[] args) {
        String[] array1 = {"A", "B", "B", "C"};

        for (String a : array1) {
            int count = 0;

            for (String each : array1) {
                if (a.equals(each)) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(a);
            }
        }
    }
}