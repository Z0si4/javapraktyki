import java.util.Scanner;
import java.util.regex.Pattern;

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
                        if (i + 1 < rzymska.length() && (rzymska.charAt(i + 1) == 'V' || rzymska.charAt(i + 1) == 'X')) {
                            liczba -= 1;
                        } else {
                            liczba += 1;
                        }
                        break;
                    case 'V':
                        liczba += 5;
                        break;
                    case 'X':
                        if (i + 1 < rzymska.length() && (rzymska.charAt(i + 1) == 'L' || rzymska.charAt(i + 1) == 'C')) {
                            liczba -= 10;
                        } else {
                            liczba += 10;
                        }
                        break;
                    case 'L':
                        liczba += 50;
                        break;
                    case 'C':
                        if (i + 1 < rzymska.length() && (rzymska.charAt(i + 1) == 'D' || rzymska.charAt(i + 1) == 'M')) {
                            liczba -= 100;
                        } else {
                            liczba += 100;
                        }
                        break;
                    case 'D':
                        liczba += 500;
                        break;
                    case 'M':
                        liczba += 1000;
                        break;
                    default:
                        System.out.println("Niepoprawny znak rzymski: " + znak);
                        return;
                }
            }
            Pattern reg=Pattern.compile("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$",Pattern.CASE_INSENSITIVE);
            if(reg.matcher(rzymska).matches()){
            System.out.println("Liczba arabska: " + liczba);
            }
            else{
                System.out.println("Niepoprawna liczba rzymska");
            }
        }
    }
}
