package maratona.java.javacore.zEXERCISE.DevDojo.Exe;

import maratona.java.javacore.zEXERCISE.DevDojo.dominio.Funcionario;
import maratona.java.javacore.zEXERCISE.DevDojo.dominio.FuncionarioPrinter;


public class FuncionarioExe {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        FuncionarioPrinter impFuncionario = new FuncionarioPrinter();

        funcionario.lerDados();
        impFuncionario.exibirDados(funcionario);
    }
}