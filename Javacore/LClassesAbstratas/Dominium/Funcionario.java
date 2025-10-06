package MaratonaJava.Javacore.LClassesAbstratas.Dominium;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void Imprime() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculaBonus();

    @Override
    public String toString(){
        return "Nome: " + this.nome + "" + "\nSalário: " + this.salario +"\n";
    }
}

