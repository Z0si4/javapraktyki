import java.util.Scanner;
public class Inicjaly {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj pierwsze imię:");
        String firstName= keyboard.nextLine();
        System.out.println("Podaj drugie imię:");
        String middleName= keyboard.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName= keyboard.nextLine();
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);
        System.out.println("Imię, drugie imię i nazwisko: "+firstName+" "+middleName+" "+lastName);
        System.out.println("Inicjały: "+firstInitial+" "+middleInitial+" "+lastInitial);
    }
}
