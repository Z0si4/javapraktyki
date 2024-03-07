import java.util.Scanner;
public class TakNie {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean poprawna = false;
        while(!poprawna) {
            System.out.println("Wpisz Tak lub Nie");
            String podana = keyboard.nextLine();
            if(podana.equalsIgnoreCase("Tak")){
                System.out.println("Podane słowo: "+podana);
                poprawna=true;
            }
            else if(podana.equalsIgnoreCase("Nie")){
                System.out.println("Podane słowo: "+podana);
                poprawna=true;
            }
            else{
                poprawna = false;
                System.out.println("Niepoprawne słowo.");
            }
        }
    }
}