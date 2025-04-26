package maratona.java.javacore.Npolimorfismo.servico;

import maratona.java.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");

    }
}
