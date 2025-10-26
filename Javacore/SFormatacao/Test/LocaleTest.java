package MaratonaJava.Javacore.SFormatacao.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    static void main() {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "jp");
        Locale localeHolanda = new Locale("nl", "nl");
        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,localeHolanda);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
        System.out.println(df4.format(calendar.getTime()));
        System.out.println(df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapao));
        System.out.println(localeHolanda.getDisplayCountry(localeJapao));
        System.out.println(localeCH.getDisplayCountry(localeJapao));
    }
}
