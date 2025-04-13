package maratona.java.javacore.Jmodificadorfinal.test;

import maratona.java.javacore.Jmodificadorfinal.dominio.Carro;
import maratona.java.javacore.Jmodificadorfinal.dominio.Comprador;
import maratona.java.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Chaves");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Kiko");
        ferrari.info();
    }
}
