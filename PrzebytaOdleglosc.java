import java.util.Scanner;

public class PrzebytaOdleglosc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj prędkość pojazdu w km/h");
        int predkosc = keyboard.nextInt();
        System.out.println("Podaj czas podróży w h");
        int czas = keyboard.nextInt();
        System.out.println("Godzina podróży | odległość");
        System.out.println("___________________________");
        for(int i=czas;i>0;i--){
            int odleglosc = predkosc*i;
            System.out.println(i +"               | "+odleglosc);
        }
}
}
