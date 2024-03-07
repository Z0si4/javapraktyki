import java.util.Scanner;
public class SumaPrzedzialu {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą niezerową: ");
        int podana = keyboard.nextInt();
        int suma = 0;
        if(podana>0){
        for(int i = 0; i<=podana;i++){
            suma=suma+i;
            System.out.println("Suma przedziału wynosi: "+suma);
        }}
        else if(podana<0){
            for(int i = 0; i>=podana;i--){
                suma=suma+i;
        }
        System.out.println("Suma przedziału wynosi: "+suma);
    }
        else{
            System.out.println("Zła liczba ");
        }
}
}

