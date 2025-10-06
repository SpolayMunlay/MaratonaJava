package MaratonaJava.Javacore.LClassesAbstratas.Dominium;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.05;
    }
}
