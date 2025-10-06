package Spolay.Activities;

public class AtividadeTaxaDeJuros08 {
    public static void main(String[] args){
     Double salario = 1200.00;
     Double taxaMinima = 9.70;
     Double taxaMedia = 37.35;
     Double taxaMaxima = 49.50;
     Double calculoDeTaxaMinima = salario - (salario*taxaMinima)/100;
     Double calculoDeTaxaMedia = salario - (salario*taxaMedia)/100;
     Double calculoDeTaxaMaxima = salario - (salario*taxaMaxima)/100;

     System.out.println("Seu salário com a taxa minima fica " + calculoDeTaxaMinima);
     System.out.println("Seu salário com a taxa média fica " + calculoDeTaxaMedia);
     System.out.println("Seu salário com a taxa máxima fica " + calculoDeTaxaMaxima);

    }
}


// Resposta do professor

//public class Aula05EstruturasCondicionais04 {
//
//    public static void main(String[] args) {
//        double salarioAnual = 70000;
//        double primeiraFaixa = 9.70 / 100;
//        double segundaFaixa = 37.35 / 100;
//        double terceiraFaixa = 49.50 / 100;
//        double valorImposto;
//
//        if (salarioAnual <= 34712) {
//            valorImposto = salarioAnual * primeiraFaixa;
//        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
//            valorImposto = salarioAnual * segundaFaixa;
//        } else {
//            valorImposto = salarioAnual * terceiraFaixa;
//        }
//
//        System.out.println(valorImposto);
//    }
//}