import java.util.Scanner;

public class Populacja {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj początkową liczbę organizmów (minimum 2): ");
        int liczbaOrganizmow = keyboard.nextInt();
        while (liczbaOrganizmow < 2) {
            System.out.println("Niepoprawna wartość. Podaj liczbę większą lub równą 2: ");
            liczbaOrganizmow = keyboard.nextInt();
        }

        System.out.println("Podaj średni dzienny przyrost populacji w procentach (nie może być ujemny): ");
        double przyrost = keyboard.nextDouble();
        while (przyrost < 0) {
            System.out.println("Niepoprawna wartość. Podaj wartość nieujemną: ");
            przyrost = keyboard.nextDouble();
        }

        System.out.println("Podaj liczbę dni rozmnażania (minimum 1): ");
        int dni = keyboard.nextInt();
        while (dni < 1) {
            System.out.println("Niepoprawna wartość. Podaj liczbę większą lub równą 1: ");
            dni = keyboard.nextInt();
        }

        for (int i = 0; i < dni; i++) {
            liczbaOrganizmow += liczbaOrganizmow * przyrost / 100;
            System.out.println("Dzień " + (i+1) + ": populacja wynosi " + liczbaOrganizmow);
        }
    }
}
