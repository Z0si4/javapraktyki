import java.util.Scanner;
public class KalkulatorCzasu {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę sekund: ");
        int Sekundy = keyboard.nextInt();
        int SekundyStartowe = Sekundy;
        int Dni = 0;
        int Godziny = 0;
        int Minuty = 0;
        while(Sekundy>=86400){
            Dni = Dni + 1;
            Sekundy = Sekundy - 86400;
        }
        while (Sekundy>=3600){
            Godziny = Godziny + 1;
            Sekundy = Sekundy - 3600;
        }
        while (Sekundy>=60){
                Minuty = Minuty + 1;
                Sekundy = Sekundy - 60;
            }
        System.out.println(SekundyStartowe+" sekund to "+Dni+" dni "+Godziny+" godzin "+Minuty+" minut "+Sekundy+" sekund");
        }
}

