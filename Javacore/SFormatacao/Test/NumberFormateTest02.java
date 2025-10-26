package MaratonaJava.Javacore.SFormatacao.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormateTest02 {
    static void main() {
        Locale localeDefalt = Locale.getDefault();
        Locale localeInglês = Locale.US;
        Locale localeItaly = Locale.ITALY;
        Locale localeNihon = Locale.JAPAN;
        NumberFormat [] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[0] = NumberFormat.getCurrencyInstance(localeDefalt);
        nf[1] = NumberFormat.getCurrencyInstance(localeInglês);
        nf[2] = NumberFormat.getCurrencyInstance(localeItaly);
        nf[3] = NumberFormat.getCurrencyInstance(localeNihon);
        double valor = 10_000.3223;
        for (NumberFormat numberFormat : nf) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "￥10000.0327383";
        try{
            System.out.println(nf[3].parse(valorString));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
