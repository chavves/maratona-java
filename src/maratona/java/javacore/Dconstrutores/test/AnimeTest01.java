package maratona.java.javacore.Dconstrutores.test;

import maratona.java.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Ação", 22, "Shounen", "Production IG");
        anime.imprime();
    }
}
