package MaratonaJava.Javacore.OExcepcion.ErrorTest;

public class StackOverflowErrorTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
