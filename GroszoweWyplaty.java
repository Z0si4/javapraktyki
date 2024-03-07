import java.util.Scanner;

public class GroszoweWyplaty {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ilość przepracowanych dni");
        int dni = keyboard.nextInt();
        if(dni>=1){
        double wyplata = 0.01;
        for(int i=1;i<=dni;i++){
            System.out.println(i+" "+wyplata);
            wyplata = wyplata*2;
        }
        }
        else{
            System.out.println("Błędna ilość dni.");
        }
    }
}