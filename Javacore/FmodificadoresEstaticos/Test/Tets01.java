package MaratonaJava.Javacore.FmodificadoresEstaticos.Test;

import MaratonaJava.Javacore.FmodificadoresEstaticos.Domain.Carro;

public class Tets01 {
    public static void main(String [] args) {
        Carro carro1 = new Carro("Lamborghine Galiardo", 370);
        Carro carro2 = new Carro("Lamborghine Urus", 320);
        Carro carro3 = new Carro("Lamborghine Aventador", 377);
    Carro.setvelocidadeLimite(200);
    System.out.println(Carro.getVelocidadeLimite());
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}