import java.util.Scanner;
public class SredniaNaOcene {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wyniki z testu pierwszego w %: ");
        double PierwszyTest = keyboard.nextDouble();
        System.out.println("Podaj wyniki z testu pierwszego w %: ");
        double DrugiTest = keyboard.nextDouble();
        System.out.println("Podaj wyniki z testu pierwszego w %: ");
        double TrzeciTest = keyboard.nextDouble();
        double SumaOcen = PierwszyTest + DrugiTest + TrzeciTest;
        double Srednia = SumaOcen/3;
        if(Srednia<=100 && Srednia>=90){
            System.out.println("Dostajesz 5!");
        }
        else if(Srednia<90 && Srednia>=80){
            System.out.println("Dostajesz 4");
        }
        else if(Srednia<80 && Srednia>=70){
            System.out.println("Dostajesz 3");
        }
        else if(Srednia<70 && Srednia>=60){
            System.out.println("Dostajesz 2");
        }
        else if(Srednia<=60){
            System.out.println("Dostajesz 1 :c");
        }
        System.out.println("Średnia ocen z trzech testów: "+Srednia);
    }
}
