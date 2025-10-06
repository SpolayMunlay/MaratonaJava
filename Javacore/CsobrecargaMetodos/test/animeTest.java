package MaratonaJava.Javacore.CsobrecargaMetodos.test;

import MaratonaJava.Javacore.CsobrecargaMetodos.dominium.Anime;

public class animeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.unite("Tokyo Ghoul S1", "TV", "Terror", 24);
        anime.impreime();
    }
}
