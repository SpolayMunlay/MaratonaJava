package MaratonaJava.Javacore.SFormatacao.Test;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class NumberFormateTest01 {
    static void main() {
        Locale localeDefalt = Locale.getDefault();
        Locale localeInglês = Locale.US;
        Locale localeItaly = Locale.ITALY;
        Locale localeNihon = Locale.JAPAN;
        NumberFormat [] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance();
        nf[0] = NumberFormat.getInstance(localeDefalt);
        nf[1] = NumberFormat.getInstance(localeInglês);
        nf[2] = NumberFormat.getInstance(localeItaly);
        nf[3] = NumberFormat.getInstance(localeNihon);
        double valor = 10_000.3223;
        for (NumberFormat numberFormat : nf) {
            numberFormat.setMaximumFractionDigits(4);
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "10000.0327383";
        try{
            System.out.println(nf[0].parse(valorString));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
