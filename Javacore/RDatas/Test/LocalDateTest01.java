package MaratonaJava.Javacore.RDatas.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    static void main() {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date =  LocalDate.of(2002,2, 8);
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getChronology());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());
        System.out.println(date.isLeapYear());

    }
}
