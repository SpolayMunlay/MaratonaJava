package MaratonaJava.Javacore.BIntroducaoMetodos.Dominio;

public class Calculadora {

    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public void subtraiDoisNumeros(int num1, int num2){
        System.out.println(num1 - num2);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        if (num1 ==0){
        return 0;
        }
        if (num2 == 0){
        return 0;
        }
        return num1 / num2;

    }
}
