package MaratonaJava.Javacore.BIntroducaoMetodos.Test;

import MaratonaJava.Javacore.BIntroducaoMetodos.Dominio.Calculadora;

public class calculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
            calculadora.somaDoisNumeros(1,2);
            calculadora.subtraiDoisNumeros(1,2);
            double result = calculadora.divideDoisNumeros(4,8);
            System.out.println(result);
    }
}
