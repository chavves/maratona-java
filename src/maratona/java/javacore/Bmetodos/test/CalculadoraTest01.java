package maratona.java.javacore.Bmetodos.test;

import maratona.java.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.print("Soma: ");
        calculadora.somarDoisNumeros();
        System.out.print("Subtração: ");
        calculadora.subtrairDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");

    }
}
