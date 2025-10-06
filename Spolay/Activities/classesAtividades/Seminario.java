package Spolay.Activities.classesAtividades;

import MaratonaJava.Javacore.Gassociacao.dominium.Local;

public class Seminario {
    private String nome;
    private Local local;
    private AlunosS[] aluno;
    private ProfessoresS[] professor;

    public void imprime() {
        System.out.println("-----------------" + getNome() + "-----------------");

        if (this.local == null) return;
        System.out.println("             Local " + local.getNome());
        System.out.println("---------------------------------------");
        if (this.professor == null) return;
        for (ProfessoresS professor : this.professor) {
            System.out.println("             Professor " + professor.getNome());
            System.out.println("             Matéria " + professor.getMateria());
            System.out.println("---------------------------------------");
        }
        if (this.aluno == null) return;
        for (AlunosS aluno : this.aluno) {
            System.out.println("             Aluno " + aluno.getNome());
            System.out.println("             Idade " + aluno.getIdade());
            System.out.println("---------------------------------------");
        }
    }

    public Seminario(String nome) {
        this.nome = nome;
    }

    public Seminario(String nome, Local local) {
        this.nome = nome;
        this.local = local;
    }

    public Seminario(String nome, Local local, AlunosS[] aluno) {
        this.nome = nome;
        this.local = local;
        this.aluno = aluno;
    }

    public Seminario(String nome, Local local, AlunosS[] aluno, ProfessoresS[] professor){
        this.nome = nome;
        this.local = local;
        this.aluno = aluno;
        this.professor = professor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setLocal(Local local){
        this.local = local;
    }
    public Local getLocal(){
        return local;
    }
    public void setAluno(AlunosS[] aluno){
        this.aluno = aluno;
    }
    public AlunosS[] getAluno() {
        return aluno;
    }
    public void setProfessor(ProfessoresS[] professor){
        this.professor = professor;
    }
    public ProfessoresS[] getProfessor(){
        return professor;
    }
}
