package MaratonaJava.Javacore.duGol.Dominium;

import java.util.Locale;

public class DugolProduto implements ProdutoInterface {
    private String nome;
    private double valor;
    private double impostoPorCento;

    public DugolProduto(String nome, double valor, double impostoPorCento) {
        this.nome = nome;
        this.valor = valor;
        this.impostoPorCento = impostoPorCento;
    }

    @Override
    public double calcularImposto() {
        return valor * impostoPorCento;
    }

    public String toString() {
        final Locale BRAZIL = new Locale("pt", "BR");
        StringBuilder sb = new StringBuilder();

        sb.append("Nome do produto: ").append(nome).append("\n");
        sb.append("Valor do produto: R$ ").append(String.format(BRAZIL, "%.2f", valor)).append("\n");
        sb.append("Valor do Imposto (AAAA LULA): R$ ").append(String.format(BRAZIL, "%.2f", Math.abs(calcularImposto()))).append("\n");
        sb.append("Valor que você paga: R$ ").append(String.format(BRAZIL, "%.2f", Math.abs(calcularImposto() + valor))).append("\n");

        return sb.toString();
    }
}
