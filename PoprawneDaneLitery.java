import java.util.Scanner;
public class PoprawneDaneLitery {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean poprawna = false;
        while(!poprawna) {
            System.out.println("Podaj litery T,t,N lub n");
            String podana = keyboard.nextLine();
            if(podana.equalsIgnoreCase("T")){
                System.out.println("Podana litera: "+podana);
                poprawna=true;
            }
            else if(podana.equalsIgnoreCase("N")){
                System.out.println("Podana litera: "+podana);
                poprawna=true;
            }
            else{
                poprawna = false;
                System.out.println("Niepoprawna litera.");
            }
        }
    }
}