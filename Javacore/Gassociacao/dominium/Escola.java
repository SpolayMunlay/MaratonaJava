package MaratonaJava.Javacore.Gassociacao.dominium;

import java.sql.SQLOutput;

public class Escola {
    private String nome;
    private Professor[] professores;


    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;

    }

    public void imprime() {
        System.out.print("Escola: ");
        System.out.println(this.nome);
        if (professores == null) return;
        for (Professor professores : professores) {
            System.out.print("Prof: ");
            System.out.println(professores.getNome());
        }

    }
    public void setNome(String nome) {
        nome = this.nome;
    }
    public String getNome() {
        return nome;
    }
    public void setProfessorers(Professor[] professores) {
        this.professores = professores;
    }
    public Professor[] getProfessores() {
        return professores;
    }
}