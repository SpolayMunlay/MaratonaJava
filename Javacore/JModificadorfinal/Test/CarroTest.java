package MaratonaJava.Javacore.JModificadorfinal.Test;

import MaratonaJava.Javacore.JModificadorfinal.Dominium.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Purple Lambo Labubu Fantasy");
        System.out.println(carro.getNome());
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Rick Ross");
        System.out.println(carro.COMPRADOR);
        carro.imprime();
    }
}
