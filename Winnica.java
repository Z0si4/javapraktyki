import java.util.Scanner;
public class Winnica {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj długość rzędu w metrach: ");
        double DlugoscRzedu = keyboard.nextDouble();
        System.out.println("Podaj ilość miejsca zajmowanego przez okratowanie w metrach: ");
        double ZajmowaneMiejsce = keyboard.nextDouble();
        System.out.println("Podaj odległości między sadzonkami w metrach: ");
        double Odleglosci = keyboard.nextDouble();
        Double LiczbaSadzonekWRzedzie = (DlugoscRzedu-2*ZajmowaneMiejsce)/Odleglosci;
        System.out.println("Ilość sadzonek w rzędzie: "+LiczbaSadzonekWRzedzie);
    }
}
