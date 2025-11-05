package MaratonaJava.Spolay.Activities;

import java.util.Scanner;

public class WeeksToMonths {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas semanas seu bebê têm?");
        int weeks = teclado.nextInt();
        int dias = weeks * 7;
        int months = weeks/4;
        double monthsPDay =  dias/28;
        double weeksRest = weeks%4;
        int wRI = (int) weeksRest;
        if (wRI < 1){
        System.out.println("Então seu bebê tem " + months + " meses" );
        }if (wRI >= 2) {
            System.out.println("Então seu bebê tem " + months + " meses e " + wRI + " semanas");
        }
        if (wRI == 1) {
            System.out.println("Então seu bebê tem " + months + " meses e uma semana");
        }
    }
}