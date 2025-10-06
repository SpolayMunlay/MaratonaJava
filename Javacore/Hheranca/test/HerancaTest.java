package MaratonaJava.Javacore.Hheranca.test;

import MaratonaJava.Javacore.Hheranca.dominium.Funcionario;
import MaratonaJava.Javacore.Hheranca.dominium.endereco;

public class HerancaTest {
    public static void main(String...args){
        endereco endereco = new endereco();
        endereco.setRua("Pl Street");
        endereco.setCep("68633-000");
        Funcionario funcionario = new Funcionario("Spolay", "0");
        funcionario.setSalario(2.500);
        funcionario.setEndereco(endereco);
        System.out.println();
        funcionario.imprime();
        System.out.println("----------Teste de Tipo Protected----------");
        System.out.println();
        funcionario.imprimeProtectedTest();
    }
}
