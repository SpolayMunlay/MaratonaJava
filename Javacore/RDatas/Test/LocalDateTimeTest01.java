package MaratonaJava.Javacore.RDatas.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    static void main() {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate dt = LocalDate.of(2222,12,2);
        LocalTime tm = LocalTime.of(22,22,2);
        System.out.println();
        System.out.println(ldt);
        LocalDateTime ldt1 = dt.atTime(tm);
        LocalDateTime ldt2 = tm.atDate(dt);
        System.out.println();
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
