package maratona.java.javacore.Aclasses.test;
// import java.util.Scanner;

import maratona.java.javacore.Aclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Simone";
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println("----------------");

        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
    }
}
