package day33_local_date_time;

import java.text.DecimalFormat;

public class Format_Decimals {

    public static void main(String[] args) {
        DecimalFormat  m = new DecimalFormat("0.00");

        double a = 22/7.0 ;

        System.out.println(a);

        System.out.println( m.format(a)  );

        //6.6785432122222222
        System.out.println( m.format(6 ) );


    }

}
