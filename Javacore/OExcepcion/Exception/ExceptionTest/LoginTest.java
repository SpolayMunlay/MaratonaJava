package MaratonaJava.Javacore.OExcepcion.Exception.ExceptionTest;

import MaratonaJava.Javacore.OExcepcion.Exception.Domain.InvalidLoguinException;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (InvalidLoguinException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws InvalidLoguinException {
        Scanner teclado = new Scanner(System.in);
        String username = "Spolay";
        String password = "javeiro";
        System.out.println("Digite o nome de usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Digite a senha do usuário");
        String senhaDigitada = teclado.nextLine();

        if (!usernameDigitado.equals(usernameDigitado) || !senhaDigitada.equals(password)) {
            throw new InvalidLoguinException("Usuário ou senha inválidos");
        }
        System.out.println("Usuario logado com sucesso");
    }
}
