package MaratonaJava.Javacore.RDatas.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    public static void main() {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 8);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.valueOf("WEDNESDAY")));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.valueOf("WEDNESDAY")));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.valueOf("WEDNESDAY")));
        System.out.println(now);
        System.out.println(now.getDayOfWeek() + " UIS");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek() + " UIS");

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek() + " UIS");
    }
}
