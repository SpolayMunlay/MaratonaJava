package MaratonaJava.Javacore.Dcontrutores.domain;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(String nome, String tipo, String genero, int episodios){
        ;
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios= episodios; }

    public Anime(String nome, String tipo, String genero, int episodios, String estudio){
        this(nome, tipo, genero, episodios);
        this.estudio = estudio;

        }

    public void impreime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
    }

}
