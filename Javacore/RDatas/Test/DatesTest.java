package MaratonaJava.Javacore.RDatas.Test;

import java.util.Date;

public class DatesTest {
    static void main() {
        Date date = new Date();
        System.out.println(date.getTime());
        date.setTime(1761020851754L);
        System.out.println( "O dia que eu fiz esse código, foi: " + date);
    }
}
