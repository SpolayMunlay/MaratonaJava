package MaratonaJava.Javacore.RDatas.Test;

import java.util.Scanner;

public class TemporalAdjusterTask {
    public static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a data de hoje, começe com os dias:");
        try {
            boolean day = teclado.hasNextInt();
            int dayTrue = teclado.nextInt();
        } catch (IllegalArgumentException e){
        }

        System.out.println("Agoras o meize:");
        try {
            boolean month = teclado.hasNextInt();
            int monthTrue = teclado.nextInt();
        } catch (IllegalArgumentException e){
        }

        System.out.println("Falta só o anus:");
        try {
            boolean year = teclado.hasNextInt();
            int yearTrue = teclado.nextInt();
        } catch (IllegalArgumentException e){
        }
    }
}
