package day33_local_date_time;
import java.time.LocalDate;

public class Dates {
    public static void main(String[] args){
        LocalDate birthDate = LocalDate.of(1993, 6, 8);
        System.out.println(birthDate);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate y = LocalDate.of(2020, 1, 1);
        boolean result = y.isLeapYear();
    }


}
