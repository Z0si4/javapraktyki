import java.util.Scanner;
public class PodatekNapiwek {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj cenę posiłku: ");
        double CenaPosilku = keyboard.nextDouble();
        double Podatek = CenaPosilku * 0.0675;
        double CenaZPodatkiem = CenaPosilku+Podatek;
        double Napiwek=CenaZPodatkiem * 0.2;
        double DoZaplaty = CenaZPodatkiem + Napiwek;
        System.out.println("Cena Posiłku: "+CenaPosilku);
        System.out.println("Podatek: "+Podatek);
        System.out.println("Napiwek: "+Napiwek);
        System.out.println("Do zapłaty: "+DoZaplaty);
    }}
