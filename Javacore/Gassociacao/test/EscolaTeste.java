package MaratonaJava.Javacore.Gassociacao.test;

import MaratonaJava.Javacore.Gassociacao.dominium.Escola;
import MaratonaJava.Javacore.Gassociacao.dominium.Professor;

public class EscolaTeste {
    public static void main(String...args){
        Professor professor = new Professor("Ebisu");
        Professor[] professores = {professor};
        Escola escola = new Escola("Konoha Academy", professores);
        escola.imprime();
    }
}
