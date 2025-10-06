package MaratonaJava.testeMaratonajava.domain;

public class usuario {
    private String nome;
    private int idade;
    private String enderecoRua;
    private String enderecoBairro;
    private String enderecoNumero;

    /// --------------------------------------------------------------------------------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEnderecoBairro(String bairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public void setEnderecoRua(String rua) {
        this.enderecoRua = enderecoRua;
    }

    public void setEnderecoNumero(String numero) {
        this.enderecoNumero = enderecoNumero;
    }

    /// --------------------------------------------------------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public int getIdade() {
        return idade;
    }


}

