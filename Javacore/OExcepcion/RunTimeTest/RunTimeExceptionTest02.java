package MaratonaJava.Javacore.OExcepcion.RunTimeTest;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Tarefa finalizada, \"a\" ou \"b\" não podem ser 0");
    }
    public static int divisao(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Argumento inválido");
            }
            return a / b;
        }
    }
