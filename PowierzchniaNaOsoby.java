public class PowierzchniaNaOsoby {
    public static void main(String[] args){
        int PomieszczeniePierwsze = 3*4;
        int PomieszczenieDrugie = 3*4;
        int PomieszczenieTrzecie = 2*3;
        int PomieszczenieCzwarte = 2*2;
        float PowierzchniaMieszkania = PomieszczeniePierwsze + PomieszczenieDrugie + PomieszczenieTrzecie + PomieszczenieCzwarte;
        float IloscOsob = 4;
        double PowierzchniaNaOsobe = PowierzchniaMieszkania/IloscOsob;
        System.out.println("Powierzchnia przypadająca na 1 osobę wynosi "+PowierzchniaNaOsobe+" metrów kwadratowych");
    }
}
