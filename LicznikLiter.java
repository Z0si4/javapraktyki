import java.util.Scanner;

public class LicznikLiter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków");
        String lancuch = keyboard.nextLine().toLowerCase();
        System.out.println("Podaj znak");
        int powtorzenia = 0;
        char znak = keyboard.nextLine().toLowerCase().charAt(0);
        for(int i=0;i<lancuch.length();i++){
            char kolejny = lancuch.charAt(i);

            if(kolejny == znak){
                powtorzenia+=1;
            }
        }
        System.out.println("Ilość wystąpień znaku w łańcuchu: "+powtorzenia);
    }
}