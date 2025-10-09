package MaratonaJava.Javacore.duGol.Test;

import MaratonaJava.Javacore.duGol.Dominium.DugolProduto;

public class DugolMain {
    public static void main(String[] args) {
        DugolProduto computador = new DugolProduto("Accer Nitro 5", 4442, 0.40);
        DugolProduto tomate = new DugolProduto("Tomate KG", 5.14, 0.16);
        System.out.println(computador);
        System.out.println(tomate);
    }
}
