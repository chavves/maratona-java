package maratona.java.javacore.Npolimorfismo.test;

import maratona.java.javacore.Npolimorfismo.repositorio.Repositorio;
import maratona.java.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import maratona.java.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>(); // ArrayList
        list.add("Chaves");
        list.add("Kiko");
        list.add("Chiquinha");
        System.out.println(list);
    }
}
