import java.util.Scanner;

public class PakietKomorkowy{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz pakiet (A, B lub C): ");
        String pakiet = scanner.nextLine();

        System.out.println("Podaj liczbe minut rozmow: ");
        int liczbaMinut = scanner.nextInt();

        double koszt;

        switch (pakiet) {
            case "A":
                if(liczbaMinut<=450){
                koszt =39.99;
                }
                else{
                    koszt = 39.99 + (liczbaMinut-450)*0.45;
                }
                break;
            case "B":
            if(liczbaMinut<=900){
                koszt =59.99;
                }
                else{
                    koszt = 59.99 + (liczbaMinut-900)*0.40;
                }
                break;
            case "C":
                koszt = 69.99;
                break;
            default:
                System.out.println("Niepoprawny pakiet.");
                return;
        }

        System.out.println("Miesieczny rachunek: " + koszt + " zlotych.");
    }
}