import java.util.Scanner;

public class SzybkoscDzwieku{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz nosnik (powietrze, woda, stal): ");
        String Nosnik = scanner.nextLine();

        double szybkosc;
        switch (Nosnik) {
            case "powietrze":
                szybkosc = 343.0;
                break;
            case "woda":
                szybkosc = 1490.0;
                break;
            case "stal":
                szybkosc = 5100.0;
                break;
            default:
                System.out.println("Niepoprawny nosnik.");
                return;
        }

        System.out.println("Podaj odleglosc (w metrach): ");
        double odleglosc = scanner.nextDouble();

        double czas = odleglosc / szybkosc;
        System.out.println("Czas potrzebny na pokonanie odleglosci w " + Nosnik + ": " + czas + " sekund.");
    }
}
