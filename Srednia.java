import java.util.Scanner;
public class Srednia {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wyniki z testu pierwszego: ");
        double PierwszyTest = keyboard.nextDouble();
        System.out.println("Podaj wyniki z testu pierwszego: ");
        double DrugiTest = keyboard.nextDouble();
        System.out.println("Podaj wyniki z testu pierwszego: ");
        double TrzeciTest = keyboard.nextDouble();
        double SumaOcen = PierwszyTest + DrugiTest + TrzeciTest;
        double Srednia = SumaOcen/3;
        System.out.println("Ocena z testu pierwszego: "+PierwszyTest);
        System.out.println("Ocena z testu drugiego: "+DrugiTest);
        System.out.println("Ocena z testu trzeciego: "+TrzeciTest);
        System.out.println("Średnia ocen z trzech testów: "+Srednia);
    }
}
