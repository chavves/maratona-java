package maratona.java.javacore.Bmetodos.test;

import maratona.java.javacore.Bmetodos.dominio.Estudante;
import maratona.java.javacore.Bmetodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "Naruto";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
