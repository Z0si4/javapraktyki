import java.util.Scanner;

public class Program_dodatkowy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wybierz tryb (1 - arabskie na rzymskie, 2 - rzymskie na arabskie): ");
        int tryb = keyboard.nextInt();
        keyboard.nextLine();

        if (tryb == 1) {
            System.out.println("Podaj liczbę: ");
            int liczba = keyboard.nextInt();

            if (liczba < 1 || liczba > 3999) {
                System.out.println("Niepoprawna liczba");
                return;
            }

            String[] tysiace = {"", "M", "MM", "MMM"};
            String[] setki = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String[] dziesiatki = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] jednosci = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

            String tysiaceRzymskie = tysiace[liczba / 1000];
            String setkiRzymskie = setki[(liczba % 1000) / 100];
            String dziesiatkiRzymskie = dziesiatki[(liczba % 100) / 10];
            String jednosciRzymskie = jednosci[liczba % 10];

            String rzymska = tysiaceRzymskie + setkiRzymskie + dziesiatkiRzymskie + jednosciRzymskie;

            System.out.println("Liczba rzymska: " + rzymska);
        } else if (tryb == 2) {
            System.out.println("Podaj liczbę rzymską: ");
            String rzymska = keyboard.nextLine();

            int liczba = 0;
            for (int i = 0; i < rzymska.length(); i++) {
                char znak = rzymska.charAt(i);
                switch (znak) {
                    case 'I':
                        liczba += (rzymska.charAt(i + 1) == 'V' || rzymska.charAt(i + 1) == 'X') ? -1 : 1;
                        break;
                    case 'V':
                        liczba += 5;
                        break;
                    case 'X':
                        liczba += (rzymska.charAt(i + 1) == 'L' || rzymska.charAt(i + 1) == 'C') ? -10 : 10;
                        break;
                    case 'L':
                        liczba += 50;
                        break;
                    case 'C':
                        liczba += (rzymska.charAt(i + 1) == 'D' || rzymska.charAt(i + 1) == 'M') ? -100 : 100;
                        break;
                    case 'D':
                        liczba += 500;
                        break;
                    case 'M':
                        liczba += 1000;
                        break;
                }
            }

            System.out.println("Liczba arabska: " + liczba);
        } else {
            System.out.println("Niepoprawny tryb.");
        }
    }
}
