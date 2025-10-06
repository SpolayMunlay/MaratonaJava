package MaratonaJava.Javacore.AIntroduçãoClasses.teste;

import MaratonaJava.Javacore.AIntroduçãoClasses.Dominium.estudante;

public class PessoaTeste01 {
    public static void main(String[] args) {
        estudante aluno1 = new estudante();
        aluno1.nome = "Spoaly";
        aluno1.idade = 23;
        aluno1.sexo = "sempreQueDer";

        System.out.println(aluno1.nome);
        System.out.println(aluno1.idade);
        System.out.println(aluno1.sexo);
    }
}
