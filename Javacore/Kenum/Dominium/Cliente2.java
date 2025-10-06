package MaratonaJava.Javacore.Kenum.Dominium;

public class Cliente2 {

    private String Nome;
    TipoCliente tipoCliente;
    TipoPagamento tipoPagamento;

    @Override
    public String toString() {
        return "Nome do Cliente" +
                "Nome: " + Nome +
                ", Tipo de Cliente: " + tipoCliente +
                ", Tipo de Pagamento: " + tipoPagamento;
    }

    public Cliente2(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        Nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }
}
