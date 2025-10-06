package MaratonaJava.Javacore.BIntroducaoMetodos.Test;

import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.PessoaGetThisSet;

public class ThisGetTest {
    public static void main (String[] args){

        PessoaGetThisSet pessoa = new PessoaGetThisSet();
        pessoa.setNome("Spolay");
        pessoa.setIdade(23);

        pessoa.imprime();
        System.out.println("Name is: "+pessoa.getNome());
        System.out.println("Age is: "+pessoa.getIdade());
    }
}
