import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PlikZOdlegloscia {
    public static void main(String[] args )throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String nazwaPliku = "predkosc.txt";
        System.out.println("Podaj prędkość pojazdu w km/h");
        int predkosc = keyboard.nextInt();
        System.out.println("Podaj czas podróży w h");
        int czas = keyboard.nextInt();
        for(int i=czas;i>0;i--){
            int odleglosc = predkosc*i;
            FileWriter fw = new FileWriter(nazwaPliku,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(i+"   "+odleglosc);
            pw.close();
        }
    }
}
