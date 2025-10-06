package MaratonaJava.Javacore.EblocosInicializacao.Domain;

public class Anime {
    private String nome;
    private int [] episodios;
    {
        System.out.println( "Coneseguimos, ver este texto pois o bloco " +
                "de iniclialização inicia-se antes do contrutot");
    }
    public Anime(){
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++)
            episodios[i]= i+1;
        for (int episodios: this.episodios){
            System.out.print(episodios +"  ");
        }
    }
}