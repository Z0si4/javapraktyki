import java.util.Scanner;
public class MasaiCiezar {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj masę obiektu:");
        double masa = keyboard.nextDouble();
        double ciezar = masa*9.8;
        if(ciezar>1000){
            System.out.println("Obiekt za ciężki");
        }
        else if(ciezar<10){
            System.out.println("Obiekt za lekki");
        }
        else{
            System.out.println("Ciężar w Newtonach: "+ciezar);
        }
    }
}
