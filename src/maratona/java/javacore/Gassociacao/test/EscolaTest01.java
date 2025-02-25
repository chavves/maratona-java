package maratona.java.javacore.Gassociacao.test;

import maratona.java.javacore.Gassociacao.dominio.Escola;
import maratona.java.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos");
        Professor[] professores = {professor};
        Escola escola = new Escola("Carlos Barros", professores);

        escola.imprime();
    }
}
