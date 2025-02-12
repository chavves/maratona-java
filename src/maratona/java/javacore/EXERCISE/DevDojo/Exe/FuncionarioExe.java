package maratona.java.javacore.EXERCISE.DevDojo.Exe;

import maratona.java.javacore.EXERCISE.DevDojo.dominio.Funcionario;
import maratona.java.javacore.EXERCISE.DevDojo.dominio.FuncionarioPrinter;


public class FuncionarioExe {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        FuncionarioPrinter impFuncionario = new FuncionarioPrinter();

        funcionario.lerDados();
        impFuncionario.exibirDados(funcionario);
    }
}