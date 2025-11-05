package MaratonaJava.Javacore.RDatas.Test;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class LocalDateTimeTest01 {
    static void main() {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate dt = LocalDate.of(2222,12,2);
        LocalTime tm = LocalTime.of(22,22,2);
        int time = tm.getNano();
        System.out.println();
        System.out.println(ldt);
        LocalDateTime ldt1 = dt.atTime(tm);
        LocalDateTime ldt2 = tm.atDate(dt);
        System.out.println();
        System.out.println(ldt1);
        System.out.println(ldt2);
        DateFormat.getDateTimeInstance(time, 0000000000, new Locale("pt", "BR"));
        System.out.println(DateFormat.getDateTimeInstance());
    }
}
