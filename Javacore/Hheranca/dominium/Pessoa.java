package MaratonaJava.Javacore.Hheranca.dominium;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected endereco endereco;

    static {
        System.out.println(" 1 Dentro do bloco de inicialização estático - Pessoa");
    }

    {
        System.out.println(" 2 dentro do bloco de inicialização - Pessoa 1");
        System.out.println(" 3 dentro do bloco de inicialização - Pessoa 2");
    }

    public Pessoa (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        System.out.println(" 4 Dentro do construtor - Pessoa");
    }

    public void imprime() {
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Rua: "+endereco.getRua());
        System.out.println("CEP: "+endereco.getCep());
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(endereco endereco) {
        this.endereco = endereco;
    }
}
