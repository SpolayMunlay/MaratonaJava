package MaratonaJava.Javacore.SFormatacao.Test;

import java.util.Locale;

public class LocaleTest02 {
    static void main() {
        System.out.println(Locale.getDefault());
        String [] isoCountrie = Locale.getISOCountries();
        String [] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+" ");
        }
        System.out.println();
        for (String isoCountries : isoCountrie){
            System.out.print(isoCountries+" ");
        }
    }
}
