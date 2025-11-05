package MaratonaJava.Javacore.RDatas.Test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    static void main() {
        LocalDateTime now = LocalDateTime.now();
        Map<String, String> shortid = ZoneId.SHORT_IDS;
        System.out.println(shortid);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zoneDateTimeTK = now.atZone(tokyoZone);
        System.out.println(zoneDateTimeTK);

        Instant nowAtInstant = Instant.now();
        ZonedDateTime zonedDateTimeTK = nowAtInstant.atZone(ZoneId.from(zoneDateTimeTK));
        System.out.println(zonedDateTimeTK);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);
        ZoneOffset zoneMN = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(zoneMN);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zoneMN);
        System.out.println(offsetDateTime2);
        OffsetDateTime offsetDateTime3 = Instant.now().atOffset(zoneMN);
        System.out.println(offsetDateTime3);
    }
}
