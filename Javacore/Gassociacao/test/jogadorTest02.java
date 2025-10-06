package MaratonaJava.Javacore.Gassociacao.test;

import MaratonaJava.Javacore.Gassociacao.dominium.Jogador;
import MaratonaJava.Javacore.Gassociacao.dominium.Time;

public class jogadorTest02 {
    public static void main(String... args) {
        Jogador jogador1 = new Jogador("Dugolaçõ");
        Time time1 = new Time("Paisandú");
        jogador1.setTime(time1);
        jogador1.imprime();
    }
}
