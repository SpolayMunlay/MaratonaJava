package Spolay.Activities;

import MaratonaJava.Javacore.Gassociacao.dominium.Local;
import Spolay.Activities.classesAtividades.AlunosS;
import Spolay.Activities.classesAtividades.ProfessoresS;
import Spolay.Activities.classesAtividades.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {
        Local local = new Local("Pitiú");
        AlunosS aluno1 = new AlunosS("Daniboy", 25);
        AlunosS aluno2 = new AlunosS("Dugolaço", 22);
        AlunosS aluno3 = new AlunosS("Layn", 17);
        AlunosS aluno4 = new AlunosS("Spolay", 23);
        AlunosS[] alunos = new AlunosS[]{aluno1, aluno2, aluno3, aluno4};
        ProfessoresS professor1 = new ProfessoresS("Vida", "Platonica");
        ProfessoresS[] professores = new ProfessoresS[]{professor1};
        Seminario seminario = new Seminario("EcoXP", local, alunos, professores);
        Seminario[] seminarios = new Seminario[]{seminario};
        professor1.setSeminario(seminarios);
        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        aluno3.setSeminario(seminario);
        aluno4.setSeminario(seminario);
        seminario.imprime();
    }
}
