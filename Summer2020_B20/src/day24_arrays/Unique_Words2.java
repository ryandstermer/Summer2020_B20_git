package day24_arrays;

public class Unique_Words2 {
    public static void main(String[] args) {
        String[] chain = {"C#", "C#", "Java", "Python", "Python", "C++"};

        for (String each : chain) {
            int count = 0;
            for (String b : chain) {
                if (each.equals(b)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }
}