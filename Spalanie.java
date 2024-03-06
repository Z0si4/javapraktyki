import java.util.Scanner;
public class Spalanie {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ilość przejechanych kilometrów");
        double kilometry= keyboard.nextDouble();
        System.out.println("Podaj ilość zużytego paliwa w litrach");
        double paliwo= keyboard.nextDouble();
        double KilometryNaLitrze = kilometry/paliwo;
        System.out.println("Liczba kilometrów przejechanych na litrze paliwa: "+KilometryNaLitrze);
    }
}
