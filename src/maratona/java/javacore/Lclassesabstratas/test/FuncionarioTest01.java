package maratona.java.javacore.Lclassesabstratas.test;

import maratona.java.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import maratona.java.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Ezreal", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.info();
        desenvolvedor.info();
    }

}
