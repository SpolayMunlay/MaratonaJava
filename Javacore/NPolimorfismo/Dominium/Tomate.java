package MaratonaJava.Javacore.NPolimorfismo.Dominium;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.16;
    public Tomate(String nome, double valor){
    super(nome, valor);
    }

    @Override
    public double faz_o_L() {
        return valor * IMPOSTO_POR_CENTO;
    }

    @Override
    public double IMPOSTO_POR_CENTO() {
        return IMPOSTO_POR_CENTO;
    }
}
