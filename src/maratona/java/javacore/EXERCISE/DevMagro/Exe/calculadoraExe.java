package maratona.java.javacore.EXERCISE.DevMagro.Exe;

import java.util.Scanner;

import static maratona.java.javacore.EXERCISE.DevMagro.dominio.calculadoraPrimo.isPrimo;

public class calculadoraExe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        while (numero != 0){
            if (isPrimo(numero)){
                System.out.println(numero +" é um número primo");
            }
            else {
                System.out.println(numero +" não é um numero primo");
            }
            System.out.print("Digite outro número (digite 0 para parar): ");
            numero = sc.nextInt();
        }
        System.out.println("Programa encerrado.");

        sc.close();
    }
}
