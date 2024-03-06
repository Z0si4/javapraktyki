import java.util.Scanner;
public class Bank {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź kwotę, jaka jest początkowo zdeponowana na koncie: ");
        double KwotaPoczatkowa = keyboard.nextDouble();
        System.out.println("Wprowadź roczną stopę oprocentowania: ");
        double Oprocentowanie = keyboard.nextDouble()/100;
        System.out.println("Ile razy w roku odsetki są kapitalizowane?");
        int Kapitalizacja = keyboard.nextInt();
        System.out.println("Przez ile lat środki będą znajdować się na koncie?");
        int IloscLat = keyboard.nextInt();
        double KwotaKoncowa = KwotaPoczatkowa * Math.pow(1+Oprocentowanie/Kapitalizacja,Kapitalizacja*IloscLat);
        System.out.println("Kwota jaka ostatecznie będzie na koncie to: "+KwotaKoncowa);
    }

}