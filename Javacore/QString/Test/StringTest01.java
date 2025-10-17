package MaratonaJava.Javacore.QString.Test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Spolay";
        String nome2 = "Spolay";
        nome = nome.concat(" Do Java");
        System.out.println(nome == nome2);
        String nome3 = new String("Spolay");
        System.out.println(nome == nome3);
    }
}
