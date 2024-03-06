import java.util.Scanner;

public class PakietOszczednosc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz pakiet (A, B lub C): ");
        String pakiet = scanner.nextLine();

        System.out.println("Podaj liczbe minut rozmow: ");
        int liczbaMinut = scanner.nextInt();

        double kosztA,kosztB,kosztC;

        if(liczbaMinut<=450){
            kosztA =39.99;
        }
        else{
            kosztA = 39.99 + (liczbaMinut-450)*0.45;
        }

        if(liczbaMinut<=900){
            kosztB =59.99;
        }
        else{
            kosztB = 59.99 + (liczbaMinut-900)*0.40;
        }

        kosztC = 69.99;

        switch (pakiet) {
            case "A":
                if(kosztB<kosztA){
                    System.out.println("Klient zaoszczędziłby " + (kosztA - kosztB) + " złotych, wybierając pakiet B.");
                }
                if(kosztC<kosztA){
                    System.out.println("Klient zaoszczędziłby " + (kosztA - kosztC) + " złotych, wybierając pakiet C.");
                }
                break;
            case "B":
                if(kosztC<kosztB){
                    System.out.println("Klient zaoszczędziłby " + (kosztB - kosztC) + " złotych, wybierając pakiet C.");
                }
                break;
            case "C":
                break;
            default:
                System.out.println("Niepoprawny pakiet.");
                return;
        }
    }
}
