package MaratonaJava.Javacore.RDatas.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    static void main() {
        LocalTime lT = LocalTime.of(1,1,1,1);
        System.out.println(lT.getHour());
        System.out.println(lT.getSecond());
        System.out.println(lT.get(ChronoField.AMPM_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}