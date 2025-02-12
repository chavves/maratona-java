package maratona.java.javacore.Bmetodos.test;

import maratona.java.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros01(20,0));
        System.out.println("----------------------");
        calculadora.imprDivisaoDeDoisNum(74,2);

    }
}
