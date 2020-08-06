package day03_sequences_variables;

public class Variables {
    public static void main(String[] args) {
        byte length = 11;
        byte width = 12;

        System.out.println(length*width);

        //byte num1 = 140; will not work, 140 is larger than byte can handle

        short num2 = 140;
        //short can handle up to 32,000ish

        long salary = 100000;
        //long can handle up to about 2,000,0000

        int house = 1000000;

        System.out.println("house");

        double PI = 3.14;
    }
}
