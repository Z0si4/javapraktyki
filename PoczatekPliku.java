import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PoczatekPliku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku: ");
        String filename = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            for (int i = 0; i < 5; i++) {
                String line = reader.readLine();
                if (line != null) {
                    System.out.println(line);
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas czytania pliku: " + e.getMessage());
        }
    }
}
