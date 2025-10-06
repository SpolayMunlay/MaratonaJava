package MaratonaJava.testeMaratonajava.domain;

public class Livro {
    private String nome;
    private String autor;
    private int anoPublicacao;
    private char disponibilidade;
    private int faixaEtaria;


    public void imprime() {
        System.out.println("nome: " + nome);
        System.out.println("autor: " + autor);
        System.out.println("anoPublicacao: " + anoPublicacao);
        System.out.println("faixaEtaria: " + faixaEtaria);
        System.out.println("---------------------------------");
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public void setDisponibilidade(char disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}



