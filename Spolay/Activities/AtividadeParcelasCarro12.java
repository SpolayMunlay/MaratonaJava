package Spolay.Activities;

public class AtividadeParcelasCarro12 {
    public static void main(String[]args){
        int valorDoCarro = 33600;
        int numeroDeParcelas  = 1;
        int valorDeparcelas = valorDoCarro;
        while (valorDeparcelas > 1000){
            ++numeroDeParcelas;
            valorDeparcelas = valorDoCarro/numeroDeParcelas;

        }System.out.println("A Quantidade de parcelas é "+numeroDeParcelas+" no valor de "+valorDeparcelas);
    }
}
