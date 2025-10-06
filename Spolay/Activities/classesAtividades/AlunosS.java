package Spolay.Activities.classesAtividades;

public class AlunosS {
    private String nome;
    private int idade;
    private Seminario seminario;

    public AlunosS(String nome) {
        this.nome = nome;
    }

    public AlunosS(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public AlunosS(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }
    public Seminario getSeminario() {
        return seminario;
    }
    public void imprime(){
        System.out.println(this.seminario.getNome());
    }
}
