package Spolay.Activities.classesAtividades;

public class Impressora {

    public void imprime(Funcionario funcionario) {
        System.out.println("-----------------------------------------------------");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("-----------------------------------------------------");
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < funcionario.getSalarios().length; i++) {
            System.out.println("Salário " + (i + 1) + ": " + funcionario.getSalarios()[i]);
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Média Salarial: " + funcionario.calcularMedia());
    }
}
