package MaratonaJava.Javacore.LClassesAbstratas.Dominium;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor (String nome, double salario){
        super(nome,salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.1;
    }
}
