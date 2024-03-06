import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj swoją wagę: ");
        double waga = keyboard.nextDouble();
        System.out.println("Podaj swój wzrost w metrach (np. 190cm = 1,9m): ");
        double wzrost = keyboard.nextDouble();
        double BMI = waga/Math.pow(wzrost,2);
        if(BMI<18.5){
            System.out.println("Masz niedowagę");
        }
        else if(BMI>25){
            System.out.println("Masz nadwagę");
        }
        else{
                System.out.println("Masz wagę w normie!");
            }
        }
    }

