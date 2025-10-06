package MaratonaJava.Javacore.Kenum.Test;

import MaratonaJava.Javacore.Kenum.Dominium.Cliente2;
import MaratonaJava.Javacore.Kenum.Dominium.TipoCliente;
import MaratonaJava.Javacore.Kenum.Dominium.TipoPagamento;

public class ClienteTest2 {
    public static void main(String[] args) {
        Cliente2 Cliente1 = new Cliente2("Spolight", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente2 Cliente02 = new Cliente2("Dugolzei", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(Cliente1);
        System.out.println(Cliente02);
        System.out.println(TipoPagamento.DEBITO.CALCULAR_DESCONTO(1000));
        System.out.println(TipoPagamento.CREDITO.CALCULAR_DESCONTO(1000));
        TipoCliente cliente03 = TipoCliente.TipoCliente_porNomeRelatorio("Pessoa Fisica");
        System.out.println(cliente03);
    }
}
