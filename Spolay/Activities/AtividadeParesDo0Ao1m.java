package Spolay.Activities;

public class AtividadeParesDo0Ao1m {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i = i + 2) {
            int j = i / 2 + 1; // posição do número par
            System.out.println("O " + j + "° número par é " + i+ ".");
        }
    }
}
