package MaratonaJava.testeMaratonajava.domain;

import java.util.ArrayList;
import java.util.Scanner;

public class cadastroDeUsuarios {
    public static void main(String... args) {
        Scanner cadastro = new Scanner(System.in);
        ArrayList<usuario> Usuario = new ArrayList<>();

        System.out.println("Deseja cadastrar Usuario? (s/n)");
        String confirmacao = cadastro.nextLine().toLowerCase();

        while (confirmacao.equals("s")) {
            usuario UsuarioNovo = new usuario();

            System.out.println("Nome do Usuario?");
            String nome = cadastro.nextLine();
            UsuarioNovo.setNome(nome);

            System.out.println("Idade do usuário?");
            int idade = cadastro.nextInt();// Limpa o buffer após nextInt()
            UsuarioNovo.setIdade(idade);

            System.out.println("Bairro do usuário?");
            String bairro = cadastro.nextLine();
            UsuarioNovo.setEnderecoBairro(bairro);

            System.out.println("Rua do usuário?");
            String rua = cadastro.nextLine();
            UsuarioNovo.setEnderecoRua(rua);

            System.out.println("N° de residência");
            String numero = cadastro.nextLine();
            UsuarioNovo.setEnderecoNumero(numero);

            Usuario.add(UsuarioNovo);
            System.out.print("Usuário cadastrado! Deseja cadastrar outro? (s/n): ");
            confirmacao = cadastro.nextLine().toLowerCase();

        }
        System.out.println(Usuario);
        cadastro.close();
    }
}