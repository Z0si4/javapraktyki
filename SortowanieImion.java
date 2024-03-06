import java.util.Scanner;
public class SortowanieImion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj pierwsze imie: ");
        String PierwszeImie = keyboard.nextLine();
        System.out.println("Podaj drugie imie: ");
        String DrugieImie = keyboard.nextLine();
        System.out.println("Podaj trzecie imie: ");
        String TrzecieImie = keyboard.nextLine();
        String wieksze = " ";
        if(PierwszeImie.compareTo(DrugieImie)>0){
            wieksze = PierwszeImie;
            PierwszeImie = TrzecieImie;
            DrugieImie = wieksze;
        }
        if(PierwszeImie.compareTo(TrzecieImie)>0){
            wieksze = PierwszeImie;
            PierwszeImie = TrzecieImie;
            TrzecieImie = wieksze;
        }
        if(DrugieImie.compareTo(TrzecieImie)>0){
            wieksze = DrugieImie;
            DrugieImie = TrzecieImie;
            TrzecieImie = wieksze;
        }
        System.out.println(PierwszeImie+" "+DrugieImie+" "+TrzecieImie);
    }
}
