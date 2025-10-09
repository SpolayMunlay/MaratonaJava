package MaratonaJava.Spolay.Activities.classesAtividades;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double soma;
    public double calcularMedia() {

        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];
        }
        return soma / salarios.length;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;

    }

    public double getSoma() {
        return soma;
    }
}
