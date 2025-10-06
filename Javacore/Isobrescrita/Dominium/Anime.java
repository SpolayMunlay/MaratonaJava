package MaratonaJava.Javacore.Isobrescrita.Dominium;

public class Anime extends Object{
    protected String nome;

    @Override
    public String toString(){
        return this.nome;
    }
    public Anime(String nome){
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
