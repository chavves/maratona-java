package maratona.java.javacore.Npolimorfismo.test;

import maratona.java.javacore.Npolimorfismo.dominio.Computador;
import maratona.java.javacore.Npolimorfismo.dominio.Produto;
import maratona.java.javacore.Npolimorfismo.dominio.Tomate;
import maratona.java.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);


        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(produto);



    }
}
