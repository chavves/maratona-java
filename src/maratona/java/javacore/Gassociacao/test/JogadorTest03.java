package maratona.java.javacore.Gassociacao.test;

import maratona.java.javacore.Gassociacao.dominio.Jogador;
import maratona.java.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Zico");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[]  jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Time ---");

        time.imprime();

    }
}
