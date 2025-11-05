package MaratonaJava.Javacore.RDatas.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(3);
        Period p1 = Period.of(1,11, 1000000000);
        Period p2 = Period.between(now, nowAfterTwoYears);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(now.until(now.plusWeeks(32), ChronoUnit.MONTHS) + " Meses");
    }
}
