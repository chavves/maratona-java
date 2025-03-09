package maratona.java.javacore.Gassociacao.test;

import maratona.java.javacore.Gassociacao.dominioexerc.Aluno;
import maratona.java.javacore.Gassociacao.dominioexerc.Local;
import maratona.java.javacore.Gassociacao.dominioexerc.Professor;
import maratona.java.javacore.Gassociacao.dominioexerc.Seminario;

public class ExercicioGerenciamento01 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Gabriel", 29);
        Aluno[] alunoParaSeminario = {aluno};

        Local local = new Local("Faculdade Youtube");

        Seminario seminario = new Seminario("Seminário de Associação", alunoParaSeminario, local);
        Seminario[] sesminarioDisponivel = {seminario};

        Professor professor = new Professor("DevDojo", "Programação");

        professor.setSeminarios(sesminarioDisponivel);
        professor.imprime();

    }

}
