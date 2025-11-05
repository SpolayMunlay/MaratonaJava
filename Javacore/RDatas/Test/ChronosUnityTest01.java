package MaratonaJava.Javacore.RDatas.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronosUnityTest01 {
    static void main() {
        LocalDateTime Bday = LocalDateTime.of(2002, Month.FEBRUARY, 02, 2, 4);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Você tem " + ChronoUnit.DAYS.between(Bday,now) + " dias " + "\n"+
                            ChronoUnit.WEEKS.between(Bday,now) + " semanas " + "\n"+
                            ChronoUnit.MONTHS.between(Bday,now) + " meses e " + "\n"+
                            ChronoUnit.YEARS.between(Bday,now) + " anos de vida.\ntá bom já de viver Spolay");
    }
}