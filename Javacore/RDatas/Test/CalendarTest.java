package MaratonaJava.Javacore.RDatas.Test;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    static void main() {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_YEAR, 10);
        c.roll(Calendar.HOUR, 12);
        Date date = c.getTime();
        System.out.println(date);
    }
}
