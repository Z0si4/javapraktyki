import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę pięter w hotelu");
        int pietra=keyboard.nextInt();
        if(pietra>=1){
        int WszystkiePokoje =0;
        int ZajetePokoje=0;
        for(int i = 1;i<=pietra;i++){
            System.out.println("Podaj łączną liczbę pokoi na piętrze nr."+i);
            int NowePokoje = keyboard.nextInt();
            if(NowePokoje>=10){
            WszystkiePokoje= NowePokoje + WszystkiePokoje;
            System.out.println("Podaj liczbę zajętych pokoi na piętrze nr."+i);
            ZajetePokoje = keyboard.nextInt() + ZajetePokoje;
            }
            else {
                System.out.println("Błędna liczba pokoi");
            }
        }
        System.out.println("Wszystkie pokoje: "+WszystkiePokoje);
        System.out.println("Zajęte pokoje: "+ZajetePokoje);
        int WolnePokoje = WszystkiePokoje - ZajetePokoje;
            System.out.println("Wolne pokoje: "+WolnePokoje);
        double zajetePokoje = ZajetePokoje;
        double wszystkiePokoje = WszystkiePokoje;
        double Oblozenie = zajetePokoje/wszystkiePokoje;
        System.out.println("Obłożenie: "+Oblozenie);
    }
        else{
            System.out.println("Błędna liczba pięter");
        }
    }
}
