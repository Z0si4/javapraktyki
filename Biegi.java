import java.util.Scanner;

public class Biegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj nazwisko pierwszego biegacza: ");
            String Biegacz1 = scanner.nextLine();
            System.out.print("Podaj nazwisko drugiego biegacza: ");
            String Biegacz2 = scanner.nextLine();
            System.out.print("Podaj nazwisko trzeciego biegacza: ");
            String Biegacz3 = scanner.nextLine();
            System.out.print("Podaj czas ukonczenia biegu przez pierwszego biegacza (w minutach): ");
            double Czas1 = scanner.nextDouble();
            System.out.print("Podaj czas ukonczenia biegu przez drugiego biegacza (w minutach): ");
            double Czas2 = scanner.nextDouble();
            System.out.print("Podaj czas ukonczenia biegu przez trzeciego biegacza (w minutach): ");
            double Czas3 = scanner.nextDouble();
            scanner.nextLine();
        
            if (Czas1 < Czas2 && Czas1 < Czas3) {
                System.out.println("Pierwszy na mecie: " + Biegacz1);
                if (Czas2 < Czas3) {
                    System.out.println("Drugi na mecie: " + Biegacz2);
                    System.out.println("Trzeci na mecie: " + Biegacz3);
                } else {
                    System.out.println("Drugi na mecie: " + Biegacz3);
                    System.out.println("Trzeci na mecie: " + Biegacz2);
                }
            } else if (Czas2 < Czas1 && Czas2 < Czas3) {
                System.out.println("Pierwszy na mecie: " + Biegacz2);
                if (Czas1 < Czas3) {
                    System.out.println("Drugi na mecie: " + Biegacz1);
                    System.out.println("Trzeci na mecie: " + Biegacz3);
                } else {
                    System.out.println("Drugi na mecie: " + Biegacz3);
                    System.out.println("Trzeci na mecie: " + Biegacz1);
                }
            } else {
                System.out.println("Pierwszy na mecie: " + Biegacz3);
                if (Czas1 < Czas2) {
                    System.out.println("Drugi na mecie: " + Biegacz1);
                    System.out.println("Trzeci na mecie: " + Biegacz2);
                } else {
                    System.out.println("Drugi na mecie: " + Biegacz2);
                    System.out.println("Trzeci na mecie: " + Biegacz1);
                }
            }
        }
    }