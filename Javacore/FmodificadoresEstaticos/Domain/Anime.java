package MaratonaJava.Javacore.FmodificadoresEstaticos.Domain;

import java.sql.SQLOutput;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++)
            episodios[i] = i + 1;
        System.out.println("Coneseguimos, ver este texto pois o bloco " +
                "de iniclialização inicia-se antes do contrutor");


    }

    public Anime(String nome) {
        this.nome = nome;
    }


    public Anime() {
        for (int episodios : Anime.episodios) {
            System.out.print(episodios + "  ");
            System.out.print("----");
        }


    }
    {   System.out.println();}
}