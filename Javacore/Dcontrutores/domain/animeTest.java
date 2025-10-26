package MaratonaJava.Javacore.Dcontrutores.domain;

import MaratonaJava.Javacore.Dcontrutores.domain.Anime;

public class animeTest {
    public static void main(String[] args) {
        Anime anime2 = new Anime("Pokemon");
        Anime anime = new Anime("Tokyo Ghoul S1", "TV", "Terror", 24, "Mad House");
        anime.impreime();
    }
}
