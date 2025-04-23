package maratona.java.javacore.Npolimorfismo.servico;

import maratona.java.javacore.Npolimorfismo.dominio.Computador;
import maratona.java.javacore.Npolimorfismo.dominio.Produto;
import maratona.java.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
