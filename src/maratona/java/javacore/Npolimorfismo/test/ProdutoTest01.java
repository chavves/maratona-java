package maratona.java.javacore.Npolimorfismo.test;

import maratona.java.javacore.Npolimorfismo.dominio.Computador;
import maratona.java.javacore.Npolimorfismo.dominio.Televisao;
import maratona.java.javacore.Npolimorfismo.dominio.Tomate;
import maratona.java.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador pc = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Verde", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(pc);
        System.out.println("____________________________");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("____________________________");
        CalculadoraImposto.calcularImposto(tv);

    }
}
