package MaratonaJava.Javacore.OExcepcion.RunTimeTest;

import MaratonaJava.Javacore.OExcepcion.Exception.Domain.Funcionario;
import MaratonaJava.Javacore.OExcepcion.Exception.Domain.Pessoa;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {
        Pessoa Pessoa1 = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
