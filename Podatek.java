import java.util.Scanner;
public class Podatek {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wartość kupowanego produktu");
        double Wartosc= keyboard.nextDouble();
        double PodatekStanowy = Wartosc * 0.04;
        double PodatekLokalny = Wartosc * 0.02;
        double CenaSprzedazy = Wartosc + PodatekLokalny + PodatekStanowy;
        System.out.println("Wartość produktu: "+Wartosc);
        System.out.println("Podatek Lokalny: "+PodatekLokalny);
        System.out.println("Podatek Stanowy: "+PodatekStanowy);
        System.out.println("Łączna cena sprzedaży: "+CenaSprzedazy);

    }
}
