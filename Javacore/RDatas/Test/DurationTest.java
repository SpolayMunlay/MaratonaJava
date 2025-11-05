package MaratonaJava.Javacore.RDatas.Test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    static void main() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        Duration betweenNowAndNowATY = Duration.between(now, nowAfterTwoYears);
        LocalTime ltNow = LocalTime.now();
        LocalTime ltNowMinusThreeHours = LocalTime.now().minusHours(3);
        Duration betweenLtNowAndLtNowMTH = Duration.between(ltNow, ltNowMinusThreeHours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(1);
        System.out.println(betweenNowAndNowATY);
        System.out.println(betweenLtNowAndLtNowMTH);
        System.out.println(d3);
        System.out.println(d4);
    }
}
