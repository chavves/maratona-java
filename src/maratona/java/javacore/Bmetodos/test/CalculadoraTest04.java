package maratona.java.javacore.Bmetodos.test;

import maratona.java.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2); // Observação: Os valores originais não são alterados devido à passagem por valor dos tipos primitivos.
        System.out.println("Dentro da CalculadoraTest04");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

    }

}
