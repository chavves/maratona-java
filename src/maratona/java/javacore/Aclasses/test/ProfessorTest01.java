package maratona.java.javacore.Aclasses.test;

import java.util.Scanner;

import maratona.java.javacore.Aclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor();
        professor.nome = sc.nextLine();
        professor.idade = sc.nextInt();
        professor.sexo = sc.next().charAt(0);
        System.out.println("Nome: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo (M/F): " + professor.sexo);

        sc.close();


    }


}
