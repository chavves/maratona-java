package maratona.java.javacore.Npolimorfismo.servico;

import maratona.java.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");

    }
}
