package MaratonaJava.Javacore.OExcepcion.RunTimeTest;

import MaratonaJava.Javacore.OExcepcion.Exception.Domain.Reader1;
import MaratonaJava.Javacore.OExcepcion.Exception.Domain.Reader2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        fileReader();
    }

    public static void fileReader(){
        // Quando se criar uma classe Reader ao invés de usar a nativa
        // ela os fecha em ordem decrescente.
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()){

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void fileReader2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
