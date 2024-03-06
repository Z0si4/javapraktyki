import java.util.Scanner;

public class PunktyKsiazki{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe ksiazek zakupionych w tym miesiacu: ");
        int liczbaKsiazek = scanner.nextInt();

        int punkty = calculatePoints(liczbaKsiazek);
        System.out.println("Liczba przyznanych punktow: " + punkty);
    }

    public static int calculatePoints(int liczbaKsiazek) {
        int punkty;
        if (liczbaKsiazek == 0) {
            punkty = 0;
        } else if (liczbaKsiazek == 1) {
            punkty = 5;
        } else if (liczbaKsiazek == 2) {
            punkty = 15;
        } else if (liczbaKsiazek == 3) {
            punkty = 30;
        } else {
            punkty = 60;
        }
        return punkty;
    }
}
