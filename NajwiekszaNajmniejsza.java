import java.util.Scanner;

public class NajwiekszaNajmniejsza {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int liczba;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {
            System.out.println("Podaj liczbę całkowitą (wpisz -99, aby zakończyć): ");
            liczba = keyboard.nextInt();

            if (liczba != -99) {
                if (liczba < min) {
                    min = liczba;
                }
                if (liczba > max) {
                    max = liczba;
                }
            }
        } while (liczba != -99);

        System.out.println("Najmniejsza wprowadzona wartość: " + min);
        System.out.println("Największa wprowadzona wartość: " + max);
    }
}
