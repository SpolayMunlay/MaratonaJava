package Spolay.Activities;

import java.util.Scanner; // importa a classe Scanner

public class TesteNome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // cria o leitor de entrada

        System.out.print("Digite seu nome: "); // mostra no console
        String nome = entrada.nextLine(); // lê o que o usuário digitar

        System.out.print("Digite sua idade: "); // mostra no console
        int idade = entrada.nextInt();

        System.out.println("seu nome é: " + nome);
        System.out.println("sua idade é: " + idade);

    }
}
