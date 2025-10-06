package MaratonaJava.testeMaratonajava.domain;

import java.util.ArrayList;
import java.util.Scanner;

public class cadastroLivros {
    public static void main(String... args) {
        Scanner cadastro = new Scanner(System.in);
        ArrayList<Livro> livro = new ArrayList<>();

        System.out.println("Dedseja cadastrar um novo livro? (s/n)");
        String confirmacao = cadastro.nextLine().toLowerCase();

        while (confirmacao.equals("s")){
            Livro livroNovo = new Livro();

            System.out.println("Título?");
            String Titulo = cadastro.nextLine();
            livroNovo.setNome(Titulo);

            System.out.println("Autor?");
            String Autor = cadastro.nextLine();
            livroNovo.setNome(Autor);

            System.out.println("Ano de publicação?");
            String anoPublicacao = cadastro.nextLine();
            livroNovo.setNome(anoPublicacao);

            System.out.println("Deseja continuar cadastrando? (s/n)");
            confirmacao = cadastro.nextLine().toLowerCase();


        }
        System.out.println(livro);
        cadastro.close();
    }
}
