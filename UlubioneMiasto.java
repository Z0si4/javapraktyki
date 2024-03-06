import java.util.Scanner;
public class UlubioneMiasto {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ulubione miasto: ");
        String Miasto = keyboard.nextLine();
        int liczbaZnakow = Miasto.length();
        String Duze = Miasto.toUpperCase();
        String Male = Miasto.toLowerCase();
        char PierwszaLitera = Miasto.charAt(0);
        System.out.println("Liczba znaków: "+liczbaZnakow);
        System.out.println("Duże litery: "+Duze);
        System.out.println("Małe litery: "+Male);
        System.out.println("Pierwsza litera: "+PierwszaLitera);
    }}
