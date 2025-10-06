package MaratonaJava.Javacore.BIntroducaoMetodos.Test;

import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.Estudante;
import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.impresoraEstudantes;
;

public class estudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        impresoraEstudantes impresora = new impresoraEstudantes();

        estudante01.nome = "Spolay";
        estudante01.idade = 23;
        estudante01.sexo = "Masculino";

        estudante02.nome = "Dugol";
        estudante02.idade = 22;
        estudante02.sexo = "Raramente";

        impresora.imprime(estudante01);
        impresora.imprime(estudante02);

    }
}