package maratona.java.javacore.Aclasses.test;

import maratona.java.javacore.Aclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Gabriel";
        estudante.idade = 28;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


    }
}
