import java.util.Scanner;
public class Oprogramowanie {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę zakupionych pakietów");
        int liczba = keyboard.nextInt();
        int cena = 99;
        double wartosc = liczba * cena;
        if(liczba>=10&&liczba<=19){
            double znizka = wartosc * 0.2;
        }
        else if(liczba>=20 && liczba<=49){
            double znizka = wartosc * 0.3;
        }
        else if(liczba>=100) {
            double znizka = wartosc * 0.5;
        }
    }
}
