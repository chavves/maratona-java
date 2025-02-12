package maratona.java.javacore.Aclasses.test;

import java.util.Scanner;

import maratona.java.javacore.Aclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = sc.nextLine();
        carro1.modelo = sc.nextLine();
        carro1.ano = sc.nextInt();
        sc.nextLine();
        System.out.println("Carro 1:\n");
        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);

        System.out.println("----------------------------------\n");

        carro2.nome = sc.nextLine();
        carro2.modelo = sc.nextLine();
        carro2.ano = sc.nextInt();
        System.out.println("Carro 2\n");
        System.out.println("Nome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);


    }
}
