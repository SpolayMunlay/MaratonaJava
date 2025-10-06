package MaratonaJava.Javacore.JModificadorfinal.Dominium;

public class Carro {
    protected String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome +" "+ this.COMPRADOR +" "+ VELOCIDADE_LIMITE);
    }

    public void setNome( String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
