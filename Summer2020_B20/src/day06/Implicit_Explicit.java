package day06;

public class Implicit_Explicit {
    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1; // implicit casting: automatically done

        long l2 = (long)s1; // implicit manually

        int i1 = 300;
        double d1 = i1;

        double d2 = 40000000000000.55555;
        int i2 = (int)d2;

        System.out.println(i2);

        long l3 = 4400;
        short s2 = (short)l3;

        int i3 = 1000;
        byte b1 = (byte)i3;

        System.out.println(b1);

        double m1 = 34.5;
        float f1 = (float)m1;

        System.out.println(f1);

    }
}

