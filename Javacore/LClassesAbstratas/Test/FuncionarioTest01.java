package MaratonaJava.Javacore.LClassesAbstratas.Test;

import MaratonaJava.Javacore.LClassesAbstratas.Dominium.Desenvolvedor;
import MaratonaJava.Javacore.LClassesAbstratas.Dominium.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Desenvolvedor Dev = new Desenvolvedor("Layn", 400);
        Gerente GerenteDaBoka = new Gerente("Dugolzei", 6000);
        Dev.Imprime();
        System.out.println(Dev);
        GerenteDaBoka.Imprime();
        System.out.println(GerenteDaBoka);;

    }
}
