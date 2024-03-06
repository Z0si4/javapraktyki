import java.util.Scanner;

public class SzukajRestauracji{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Czy ktoras z osob jest na diecie wegetarianskiej? (tak/nie): ");
        String wegetarianizm = scanner.nextLine().toLowerCase();

        System.out.println("Czy ktoras z osob jest na diecie weganskiej? (tak/nie): ");
        String weganizm = scanner.nextLine().toLowerCase();

        System.out.println("Czy ktoras z osob jest na diecie bezglutenowej? (tak/nie): ");
        String bezglutenowa = scanner.nextLine().toLowerCase();

        System.out.println("Mozecie wybrac sie do nastepujacych restauracji:");

        if (checkVegetarian(wegetarianizm)) {
            if (checkVegan(weganizm)) {
                if (checkGlutenFree(bezglutenowa)) {
                    System.out.println("Kawiarnia na Rogu");
                    System.out.println("Kuchnia u Szefa");
                } else {
                    System.out.println("Kawiarnia na Rogu");
                    System.out.println("Kuchnia u Szefa");
                }
            } else {
                if (checkGlutenFree(bezglutenowa)) {
                    System.out.println("Kawiarnia na Rogu");
                    System.out.println("Kuchnia u Szefa");
                } else {
                    System.out.println("Kawiarnia na Rogu");
                    System.out.println("Kuchnia u Szefa");
                }
            }
        } else {
            if (checkVegan(weganizm)) {
                if (checkGlutenFree(bezglutenowa)) {
                    System.out.println("Kawiarnia na Rogu");
                    System.out.println("Kuchnia u Szefa");
                } else {
                    System.out.println("Kawiarnia na Rogu");
                    System.out.println("Kuchnia u Szefa");
                }
            } else {
                if (checkGlutenFree(bezglutenowa)) {
                    System.out.println("Kawiarnia na Rogu");
                    System.out.println("Kuchnia u Szefa");
                } else {
                    System.out.println("Luksusowe Burgery u Jarka");
                    System.out.println("Wloskie Specjaly");
                    System.out.println("Kuchnia u Szefa");
                }
            }
        }
    }

    public static boolean checkVegetarian(String wegetarianizm) {
        return wegetarianizm.equals("tak");
    }

    public static boolean checkVegan(String weganizm) {
        return weganizm.equals("tak");
    }

    public static boolean checkGlutenFree(String bezglutenowa) {
        return bezglutenowa.equals("tak");
    }
}
