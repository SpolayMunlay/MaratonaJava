package MaratonaJava.Javacore.MInterfaces.Dominium;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void chekingPermisions(){
        System.out.println("Fazendo checagem de permissões...");
    }
    public static void retrieveMaxSize(){
        System.out.println("Dentro do retrieveMaxSize na interface");
    }
}
