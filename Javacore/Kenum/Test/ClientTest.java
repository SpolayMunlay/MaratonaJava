package MaratonaJava.Javacore.Kenum.Test;

import MaratonaJava.Javacore.Kenum.Dominium.Cliente;

import static MaratonaJava.Javacore.Kenum.Dominium.TipoCliente.PESSOA_FISICA;
import static MaratonaJava.Javacore.Kenum.Dominium.TipoCliente.PESSOA_JURIDICA;

public class ClientTest {
    public static void main(String[] args) {
        Cliente Cliente1 = new Cliente("Spolight", PESSOA_FISICA);
        Cliente Cliente2 = new Cliente("Danididdy", PESSOA_FISICA);
        Cliente Cliente3 = new Cliente("Dugolaço", PESSOA_FISICA);
        Cliente Cliente4 = new Cliente("Rafalink", PESSOA_JURIDICA);
        System.out.println(Cliente1);
        System.out.println(Cliente2);
        System.out.println(Cliente3);
        System.out.println(Cliente4);
    }
}