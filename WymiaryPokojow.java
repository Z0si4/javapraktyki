import java.util.Scanner;
public class WymiaryPokojow {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj szerokość pierwszego pomieszczenia");
        float SzerokoscPomieszczeniaPierwszego= keyboard.nextFloat();;
        System.out.println("Podaj długość pierwszego pomieszczenia");
        float DlugoscPomieszczeniaPierwszego= keyboard.nextFloat();;
        System.out.println("Podaj szerokość drugiego pomieszczenia");
        float SzerokoscPomieszczeniaDrugiego= keyboard.nextFloat();;
        System.out.println("Podaj długość drugiego pomieszczenia");
        float DlugoscPomieszczeniaDrugiego= keyboard.nextFloat();;
        System.out.println("Podaj szerokość trzeciego pomieszczenia");
        float SzerokoscPomieszczeniaTrzeciego= keyboard.nextFloat();;
        System.out.println("Podaj długość trzeciego pomieszczenia");
        float DlugoscPomieszczeniaTrzeciego= keyboard.nextFloat();;
        System.out.println("Podaj szerokość czwartego pomieszczenia");
        float SzerokoscPomieszczeniaCzwartego= keyboard.nextFloat();;
        System.out.println("Podaj długość czwartego pomieszczenia");
        float DlugoscPomieszczeniaCzwartego= keyboard.nextFloat();;

        float PomieszczeniePierwsze = SzerokoscPomieszczeniaPierwszego * DlugoscPomieszczeniaPierwszego;
        float PomieszczenieDrugie = SzerokoscPomieszczeniaDrugiego * DlugoscPomieszczeniaDrugiego;
        float PomieszczenieTrzecie = SzerokoscPomieszczeniaTrzeciego * DlugoscPomieszczeniaTrzeciego;
        float PomieszczenieCzwarte = SzerokoscPomieszczeniaCzwartego * DlugoscPomieszczeniaCzwartego;
        float PowierzchniaMieszkania = PomieszczeniePierwsze + PomieszczenieDrugie + PomieszczenieTrzecie + PomieszczenieCzwarte;
        float IloscOsob = 4;
        double PowierzchniaNaOsobe = PowierzchniaMieszkania/IloscOsob;
        System.out.println("Powierzchnia mieszkania wynosi "+PowierzchniaMieszkania+", a powierzchnia przypadająca na 1 osobę wynosi "+PowierzchniaNaOsobe+" metrów kwadratowych");
    }
}
