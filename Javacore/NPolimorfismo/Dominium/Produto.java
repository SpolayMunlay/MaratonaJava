package MaratonaJava.Javacore.NPolimorfismo.Dominium;

public abstract class Produto implements Taxade {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nome do producto: " + nome +
                "\nValor do producto: R$ " + (valor - faz_o_L()) +
                "\nValor do Imposto: R$ " + faz_o_L()+
                "\nValor que você paga: R$ " + valor +
                "\nQuatidade de imposto: "+ IMPOSTO_POR_CENTO() +
                "\n";
    }
}

