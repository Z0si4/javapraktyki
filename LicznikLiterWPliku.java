import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LicznikLiterWPliku {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ścieżkę do pliku");
        String sciezka = keyboard.nextLine();
        System.out.println("Podaj znak");
        char znak = keyboard.nextLine().toLowerCase().charAt(0);

        int powtorzenia = 0;
        try {
            File plik = new File(sciezka);
            Scanner czytnik = new Scanner(plik);
            while (czytnik.hasNextLine()) {
                String linia = czytnik.nextLine().toLowerCase();
                for(int i=0; i<linia.length(); i++){
                    char kolejny = linia.charAt(i);
                    if(kolejny == znak){
                        powtorzenia+=1;
                    }
                }
            }
            czytnik.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku.");
            e.printStackTrace();
        }

        System.out.println("Ilość wystąpień znaku w pliku: "+powtorzenia);
    }
}
