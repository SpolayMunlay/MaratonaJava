package MaratonaJava.Javacore.CsobrecargaMetodos.dominium;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    public void unite(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios= episodios;}
        public void unite(String nome, String tipo, String genero, int episodios ){
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios= episodios;
    }

    public void impreime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNome (){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;

    }
}
