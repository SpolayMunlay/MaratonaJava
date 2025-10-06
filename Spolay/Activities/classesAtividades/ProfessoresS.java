package Spolay.Activities.classesAtividades;

public class ProfessoresS {
    private String nome;
    private String materia;
    private Seminario[] seminarios;

    public ProfessoresS(String nome) {
        this.nome = nome;
    }

    public ProfessoresS(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }

    public ProfessoresS(String nome, String materia, Seminario[] seminario){
        this.nome = nome;
        this.materia = materia;
        this.seminarios = seminarios;

    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setMateria(){
        this.materia = materia;
    }
    public String getMateria(){
        return materia;
    }
    public void setSeminario(Seminario[]seminarios){
        this.seminarios = seminarios;
    }
    public Seminario[] GetSeminario() {
        return seminarios;
    }

    public void imprime(){
        for (Seminario seminario : this.seminarios){
            System.out.println(seminario.getLocal().getNome());
            for (AlunosS alunosS : seminario.getAluno()){
                System.out.println(alunosS.getNome());
            }
        }
    }
}
