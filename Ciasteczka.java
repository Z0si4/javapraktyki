import java.util.Scanner;
public class Ciasteczka {
    public static void main(String[] args){
        double IloscCiasteczek = 40;
        double IloscPorcji = 10;
        double CiasteczkaWPorcji=IloscCiasteczek/IloscPorcji;
        double KalorieWPorcji = 300;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ilość zjedzonych ciasteczek: ");
        double ZjedzoneCiasteczka= keyboard.nextDouble();
        double ZjedzonePorcje = ZjedzoneCiasteczka/CiasteczkaWPorcji;
        double ZjedzoneKalorie = ZjedzonePorcje * KalorieWPorcji;
        System.out.println("Zjadłeś "+ZjedzoneKalorie+"kcal");
    }
}
