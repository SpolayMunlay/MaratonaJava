package MaratonaJava.Javacore.OExcepcion.Exception.Domain;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws InvalidLoguinException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
