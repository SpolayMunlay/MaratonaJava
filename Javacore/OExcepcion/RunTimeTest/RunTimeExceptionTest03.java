package MaratonaJava.Javacore.OExcepcion.RunTimeTest;

import java.io.IOException;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        extracted2();
    }
    private static String extracted() {
        try{
            System.out.println("Abrindo arquivo");
            throw new IOException();
        } catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Fechando SO");
        }
        return "Erro de modificação de arquivo";
    }
    private static void extracted2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Editando arquivo");
        }
        finally {
            System.out.println("Fechando SO");
        }
    }
}