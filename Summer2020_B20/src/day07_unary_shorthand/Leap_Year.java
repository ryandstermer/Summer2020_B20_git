package day07_unary_shorthand;

public class Leap_Year {
    public static void main(String[] args) {
        short year = 2020;
        int year2 = (year % 4);
        boolean leapYear = year2 == 0;

        System.out.println(year + " is a leap year: " + leapYear);
    }
}
