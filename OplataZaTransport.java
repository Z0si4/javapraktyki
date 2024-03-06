import java.util.Scanner;

public class OplataZaTransport {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę");
        double waga = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Podaj drogę");
        double droga = scanner.nextDouble();

        int granica = 500;

        double kg1 = 1;
        double kg2 = 3;
        double kg3 = 5;
        double cena;

        if ( waga > kg3 ) {
            cena = 3.80;
        } else if ( waga > kg2) {
            cena = 3.70;
        } else if ( waga > kg1 ) {
            cena = 2.20;
        } else {
            cena = 1.10;
        }
        double kilometry = 0;

        for ( double i = droga; i > 0; i -= 500 ) {
            kilometry++;
        }

        double koszt = kilometry * cena;
        System.out.printf("Koszt wynosi: %.2f", koszt);
    }
}