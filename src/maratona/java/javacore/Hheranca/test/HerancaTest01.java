package maratona.java.javacore.Hheranca.test;

import maratona.java.javacore.Hheranca.dominio.Endereco;
import maratona.java.javacore.Hheranca.dominio.Funcionario;
import maratona.java.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua do Barril, 8");
        endereco.setCep("12345-678");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Chaves");
        pessoa.setCpf("888888888");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Kiko");
        funcionario.setCpf("2222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("------------------------------------------");
        funcionario.imprime();
        funcionario.relatorioPagamento();

    }
}
