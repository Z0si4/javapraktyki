import java.util.Scanner;
public class TluszczWProdukcie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe kalorii w produkcie: ");
        int Kalorie = scanner.nextInt();

        System.out.print("Podaj liczbe gramow tluszczu w produkcie: ");
        int Tluszcz = scanner.nextInt();

        double KalorieZTluszczu = Tluszcz * 9.0;
        double KalorieZTluszczuProcent = (KalorieZTluszczu / Kalorie) * 100;

        

        if (KalorieZTluszczuProcent < 30) {
            System.out.println("Produkt jest niskotluszczowy.");
        }

        if (KalorieZTluszczu > Kalorie) {
            System.out.println("Dane wejsciowe sa nieprawidlowe.");
        }
        else{
            System.out.println("Procent kalorii pochodzacych z tluszczu: "+ KalorieZTluszczuProcent+"%");
        }
    }
}