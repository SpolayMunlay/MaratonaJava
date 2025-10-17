package MaratonaJava.Javacore.OExcepcion.Exception.Domain;

public class InvalidLoguinException extends Exception{
    public InvalidLoguinException() {
        super("Login inválido");
    }
    public InvalidLoguinException(String message) {
        super(message);
    }
}
