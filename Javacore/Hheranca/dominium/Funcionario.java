package MaratonaJava.Javacore.Hheranca.dominium;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println(" 5 dentro do bloco de inicialização estático - Funcionário");
    }

    {
        System.out.println(" 6 dentro do bloco de estático - Funcionário 1");
        System.out.println(" 7 dentro do bloco de estático - Funcionário 2");
    }

    public Funcionario(String nome, String cpf){
        super(nome, cpf);
        System.out.println(" 8 dentro do construtor - Funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
        // se pode interagir com a classe pessoa da forma abaixo usando "this" além de "pessoa.getnome" por causa
        // renomeação dos tipos de Strings de private pra protected
        public void imprimeProtectedTest(){
            System.out.println(this.nome);
        }
    }