package MaratonaJava.Javacore.BIntroducaoMetodos.Dominio;

public class PessoaGetThisSet {

    private String nome;
    private int idade;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        if (idade < 0) {
            System.out.println("idade inválida");
            return;
        }
        System.out.println("idade: " + this.idade);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
