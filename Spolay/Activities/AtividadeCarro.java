package Spolay.Activities;

import MaratonaJava.Javacore.AIntroduçãoClasses.Dominium.Carro;

public class AtividadeCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
            carro1.montadora = "Toyota";
            carro1.modelo = "Supra MK4";
            carro1.ano = 2014;

                System.out.println("Carro de modelo: "+carro1.modelo+
                        "\npela montadora: "+carro1.montadora+
                        "\nde ano: "+carro1.ano);


    }
}
