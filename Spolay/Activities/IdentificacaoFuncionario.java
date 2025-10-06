package Spolay.Activities;

import Spolay.Activities.classesAtividades.Funcionario;
import Spolay.Activities.classesAtividades.Impressora;

public class IdentificacaoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Impressora impFuncionario = new Impressora();

        funcionario1.setNome("Spolay") ;
        funcionario1.setIdade(23) ;
        funcionario1.setSalarios( new double[]{1250, 1512, 350, 4553.98});

        impFuncionario.imprime(funcionario1);

    }
}