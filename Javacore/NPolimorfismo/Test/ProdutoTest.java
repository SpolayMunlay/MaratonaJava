package MaratonaJava.Javacore.NPolimorfismo.Test;

import MaratonaJava.Javacore.NPolimorfismo.Dominium.Computador;
import MaratonaJava.Javacore.NPolimorfismo.Dominium.Tomate;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Accer Nitro 5", 4442);
        Tomate tomate = new Tomate("Tomate KG", 	 5.14);
        System.out.println(computador);
        System.out.println(tomate);
    }
}
