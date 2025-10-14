package MaratonaJava.Javacore.OExcepcion.ExceptionTest;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo() throws IOException {
        File file = new File("Arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("criando novo arquivo" + isCriado);
            } catch (IOException e ){
            e.printStackTrace();
        }
    }
}