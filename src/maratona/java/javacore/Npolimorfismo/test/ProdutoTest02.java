package maratona.java.javacore.Npolimorfismo.test;

import maratona.java.javacore.Npolimorfismo.dominio.Computador;
import maratona.java.javacore.Npolimorfismo.dominio.Produto;
import maratona.java.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("--------------------");

        Produto produto1 = new Tomate("Americano", 20);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());
        System.out.println("--------------------");
    }
}
