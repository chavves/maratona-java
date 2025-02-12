package maratona.java.javacore.Bmetodos.test;

import maratona.java.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros); // Requer um array explicitamente, passando-o como um argumento.
        calculadora.somaVarArgs(2,4,6,8); // Permite passar qualquer quantidade de números inteiros (ou nenhum).



    }

}
