package maratona.java.javacore.Csobrecargametodos.test;

import maratona.java.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Ação", 22, "Shounen");
        anime.imprime();
    }
}
