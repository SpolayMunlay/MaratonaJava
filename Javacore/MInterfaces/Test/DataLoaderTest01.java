package MaratonaJava.Javacore.MInterfaces.Test;

import MaratonaJava.Javacore.MInterfaces.Dominium.DataBaseLoader;
import MaratonaJava.Javacore.MInterfaces.Dominium.DataLoader;
import MaratonaJava.Javacore.MInterfaces.Dominium.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        dataBaseLoader.remove();
        dataBaseLoader.chekingPermisions();
        fileLoader.load();
        fileLoader.remove();
        fileLoader.chekingPermisions();
        System.out.println();
        DataBaseLoader.retrieveMaxSize();
        DataLoader.retrieveMaxSize();
        FileLoader.retrieveMaxSize();
    }
}
