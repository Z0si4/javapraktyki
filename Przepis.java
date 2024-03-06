import java.util.Scanner;
public class Przepis {
    public static void main(String[] args){
        double cukier = 1.5;
        double maslo = 1;
        double maka = 2.75;
        double JednaPorcja = 48;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ilość ciasteczek, które chcesz upiec: ");
        double IloscCiasteczek = keyboard.nextDouble();
        double IloscPorcji = IloscCiasteczek/JednaPorcja;
        double IloscCukru = cukier * IloscPorcji;
        double IloscMasla = maslo * IloscPorcji;
        double IloscMaki = maka * IloscPorcji;
        System.out.println("Aby upiec tyle ciasteczek będziesz potrzebować: "+IloscCukru+" szklanek cukru, "+
                IloscMasla+" szklanek masła i "+IloscMaki+" szklanek mąki");
    }

}
