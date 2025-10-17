package MaratonaJava.Javacore.QString.Test;

public class StringPerformanceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += 1; // 0, 01, 012, 0123
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
