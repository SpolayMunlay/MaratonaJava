package MaratonaJava.Javacore.MInterfaces.Dominium;

public class FileLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregando Dados de Arquivo...");
    }
    public void remove(){
        System.out.println("Deletando Dados de Arquivo...");
    }

    @Override
    public void chekingPermisions() {
        System.out.println("Checando permissões do Arquivo...");
    }
    public static void retrieveMaxSize(){
        System.out.println("Dentro do retrieveMaxSize no Arquivo");
    }
}
