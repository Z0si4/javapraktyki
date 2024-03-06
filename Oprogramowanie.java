import java.util.Scanner;
public class Oprogramowanie {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę zakupionych pakietów");
        int liczba = keyboard.nextInt();
        int cena = 99;
        double wartosc = liczba * cena;
        double znizka = 0;
        if(liczba>=10&&liczba<=19){
            znizka = wartosc * 0.2;
        }
        else if(liczba>=20 && liczba<=49){
            znizka = wartosc * 0.3;
        }
        else if(liczba>=50 && liczba<=99){
            znizka = wartosc * 0.4;
        }
        else if(liczba>=100) {
            znizka = wartosc * 0.5;
        }
        double CenaKoncowa = wartosc - znizka;
        System.out.println("Wartość zamówienia po zniżce: "+CenaKoncowa);
        System.out.println("Wartość zniżki: " + znizka);
    }
}
