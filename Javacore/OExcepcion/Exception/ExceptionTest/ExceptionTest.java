package MaratonaJava.Javacore.OExcepcion.Exception.ExceptionTest;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args){
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("Arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("criando novo arquivo" + isCriado);
        } catch (IOException e ){
            e.printStackTrace();
        }
    }
}