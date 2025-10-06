package Spolay.Activities;

public class AividadeEstruturaSwitch10 {
    public static void main(String[] args){
        Byte dias = 6;
        switch (dias){
            case 1:
                System.out.println("Hoje é domingo, fim de semana");
                break;
                case 2:
                System.out.println("Hoje é segunda, Dia útil");
                break;
                case 3:
                System.out.println("Hoje é terça, Dia útil");
                break;
                case 4:
                System.out.println("Hoje é quarta, Dia útil");
                break;
                case 5:
                System.out.println("Hoje é quinta, Dia útil");
                break;
                case 6:
                System.out.println("Hoje é sexta, dia de bater em quenga");
                break;
                case 7:
                System.out.println("Hoje é sábado, fim de semana");
                break;
            default:
                System.out.println("Houve algum erro");
                break;
        }
    }
}
