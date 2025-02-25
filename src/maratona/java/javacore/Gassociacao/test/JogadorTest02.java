package maratona.java.javacore.Gassociacao.test;

import maratona.java.javacore.Gassociacao.dominio.Jogador;
import maratona.java.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Time time = new Time("Real Madrid");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
