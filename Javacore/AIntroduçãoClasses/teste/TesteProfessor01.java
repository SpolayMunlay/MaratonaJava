package MaratonaJava.Javacore.AIntroduçãoClasses.teste;

import MaratonaJava.Javacore.AIntroduçãoClasses.Dominium.Professor;

public class TesteProfessor01 {
    public static void main(String[] args) {

    Professor Professor1 = new Professor();
    Professor1.nome = "Sei lá";
    Professor1.sexo = "Masculino";
    Professor1.idade = 35;

        System.out.printf("O nome do professor é: "
                +Professor1.nome+"\nA idade do corno é: "
                +Professor1.idade+ "\nO sexo do infeliz é: "
                +Professor1.sexo);
    }
}
