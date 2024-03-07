import java.util.Scanner;

public class Opady {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Z ilu lat zbieramy dane?");
        int Lata = keyboard.nextInt();
        double Centymentry = 0;
        int miesiace = 0;
        double OpadyStyczen = 0;
        double OpadyLuty = 0;
        double OpadyMarzec = 0;
        double OpadyKwiecien = 0;
        double OpadyMaj = 0;
        double OpadyCzerwiec = 0;
        double OpadyLipiec = 0;
        double OpadySierpien = 0;
        double OpadyWrzesien = 0;
        double OpadyPazdziernik = 0;
        double OpadyListopad = 0;
        double OpadyGrudzien = 0;
        if (Lata >= 1) {
            for (int i = 0; i < Lata; i++) {
                for (int miesiac = 1; miesiac <= 12; miesiac++) {
                    System.out.println("Podaj ilość opadów w cm w miesiącu o numerze " + miesiac);
                    double NoweCentymentry = keyboard.nextDouble();
                    if (NoweCentymentry > 0) {
                        Centymentry += NoweCentymentry;
                        miesiace++;
                        if (miesiac == 1) {
                            OpadyStyczen += NoweCentymentry;
                        } else if (miesiac == 2) {
                            OpadyLuty += NoweCentymentry;
                        } else if (miesiac == 3) {
                            OpadyMarzec += NoweCentymentry;
                        } else if (miesiac == 4) {
                            OpadyKwiecien += NoweCentymentry;
                        } else if (miesiac == 5) {
                            OpadyMaj += NoweCentymentry;
                        } else if (miesiac == 6) {
                            OpadyCzerwiec += NoweCentymentry;
                        } else if (miesiac == 7) {
                            OpadyLipiec += NoweCentymentry;
                        } else if (miesiac == 8) {
                            OpadySierpien += NoweCentymentry;
                        } else if (miesiac == 9) {
                            OpadyWrzesien += NoweCentymentry;
                        } else if (miesiac == 10) {
                            OpadyPazdziernik += NoweCentymentry;
                        } else if (miesiac == 11) {
                            OpadyListopad += NoweCentymentry;
                        } else if (miesiac == 12) {
                            OpadyGrudzien += NoweCentymentry;
                        }
                    }
                }
                System.out.println("Liczba miesięcy: " + miesiace);
                System.out.println("Łączna liczba opadów w cm przez cały okres: " + Centymentry);
                System.out.println("Średnia liczba opadów w Styczniu przez cały okres (w cm): " + OpadyStyczen / Lata);
                System.out.println("Średnia liczba opadów w Lutym przez cały okres (w cm): " + OpadyLuty / Lata);
                System.out.println("Średnia liczba opadów w Marcu przez cały okres (w cm): " + OpadyMarzec / Lata);
                System.out.println("Średnia liczba opadów w Kwietniu przez cały okres (w cm): " + OpadyKwiecien / Lata);
                System.out.println("Średnia liczba opadów w Maju przez cały okres (w cm): " + OpadyMaj / Lata);
                System.out.println("Średnia liczba opadów w Czerwcu przez cały okres (w cm): " + OpadyCzerwiec / Lata);
                System.out.println("Średnia liczba opadów w Lipcu przez cały okres (w cm): " + OpadyLipiec / Lata);
                System.out.println("Średnia liczba opadów w Sierpniu przez cały okres (w cm): " + OpadySierpien / Lata);
                System.out.println("Średnia liczba opadów we Wrześniu przez cały okres (w cm): " + OpadyWrzesien / Lata);
                System.out.println("Średnia liczba opadów w Październiku przez cały okres (w cm): " + OpadyPazdziernik / Lata);
                System.out.println("Średnia liczba opadów w Listopadzie przez cały okres (w cm): " + OpadyListopad / Lata);
                System.out.println("Średnia liczba opadów w Grudniu przez cały okres (w cm): " + OpadyGrudzien / Lata);
            }
        }
    }
}