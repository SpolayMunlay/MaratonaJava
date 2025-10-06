package MaratonaJava.Javacore.Gassociacao.test;

import MaratonaJava.Javacore.Gassociacao.dominium.Jogador;

public class jogadorTest01 {
    public static void main(String [] args){
        Jogador jogador1 = new Jogador("Luiz Spolay da Silva");
        Jogador jogador2 = new Jogador("Luan de oi em nois da Silva");
        Jogador jogador3 = new Jogador("GG silver da Silva");
        Jogador [] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        for (Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}
