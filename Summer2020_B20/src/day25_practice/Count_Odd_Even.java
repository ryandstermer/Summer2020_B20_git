package day25_practice;

public class Count_Odd_Even {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int even = 0;
        int odd = 0;

        System.out.print("Evens: ");
        for (int each : numbers) {
            if (each % 2 == 0) {
                System.out.print(each + " ");
                even++;
            }
        }
        System.out.println();
        System.out.print("Odds: ");
        for (int each : numbers) {
            if (each % 2 != 0) {
                System.out.print(each + " ");
                odd++;
            }
        }
            System.out.println();
            System.out.println("There are " + even + " even and " + odd + " odd");
        }
    }

