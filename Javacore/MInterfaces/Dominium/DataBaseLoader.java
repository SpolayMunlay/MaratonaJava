package MaratonaJava.Javacore.MInterfaces.Dominium;

public class DataBaseLoader implements DataLoader, DataRemove {
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados...");
    }
    public void remove(){
        System.out.println("Removendo Banco de Dados...");
    }

    @Override
    public void chekingPermisions() {
        System.out.println("Checando permissões do Banco de Dados...");
    }
    public static void retrieveMaxSize(){
        System.out.println("Dentro do retrieveMaxSize na classe DataBaseLoader");
    }
}
