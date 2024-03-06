import java.util.Scanner;
public class ZyskZeSprzedazy {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj cenę detaliczną płytki: ");
        double CenaDetaliczna = keyboard.nextDouble();
        double Zysk = CenaDetaliczna * 0.4;
        System.out.println("Zysk ze sprzedaży płytki płytki: "+Zysk);
}}
