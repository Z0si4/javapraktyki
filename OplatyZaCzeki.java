import java.util.Scanner;

public class OplatyZaCzeki{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe czekow wystawionych w danym miesiacu: ");
        int liczbaCzekow = scanner.nextInt();

        double oplataPodstawowa = 10.0;
        double dodatkowaOplata;

        if (liczbaCzekow < 20) {
            dodatkowaOplata = 0.10;
        } else if (liczbaCzekow < 40) {
            dodatkowaOplata = 0.08;
        } else if (liczbaCzekow < 60) {
            dodatkowaOplata = 0.06;
        } else {
            dodatkowaOplata = 0.04;
        }

        double oplataMiesieczna = oplataPodstawowa + dodatkowaOplata * liczbaCzekow;
        System.out.println("Oplaty bankowe za ten miesiac: " + oplataMiesieczna + " zlotych.");
    }
}
