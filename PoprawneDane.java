import java.util.Scanner;
public class PoprawneDane {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean poprawna = false;
        while(!poprawna) {
            System.out.println("Podaj liczbę z zakresu 10-24");
            int podana = keyboard.nextInt();
            if(podana<10||podana>24){
                poprawna = false;
                System.out.println("Niepoprawna liczba.");
            }
            else{
                System.out.println("Podana liczba: "+podana);
                poprawna=true;
            }
        }
    }
}

