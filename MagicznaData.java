import java.util.Scanner;
public class MagicznaData {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj numer dnia miesiąca: ");
        int dzien = keyboard.nextInt();
        System.out.println("Podaj numer miesiąca: ");
        int miesiac = keyboard.nextInt();
        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        int rok = keyboard.nextInt();
        if(dzien*miesiac==rok){
            System.out.println("Ta data jest magiczna");
        }
        else{
            System.out.println("Ta data nie jest magiczna");
        }

    }
}