package MaratonaJava.Javacore.RDatas.Test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {
    static void main() {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(-3,1_000_000_000));
    }
}
