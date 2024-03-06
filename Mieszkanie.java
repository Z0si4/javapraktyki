public class Mieszkanie {
    public static void main(String[] args){
    int PomieszczeniePierwsze = 3*4;
        int PomieszczenieDrugie = 3*4;
        int PomieszczenieTrzecie = 2*3;
        int PomieszczenieCzwarte = 2*2;
        int PowierzchniaMieszkania = PomieszczeniePierwsze + PomieszczenieDrugie + PomieszczenieTrzecie + PomieszczenieCzwarte;
        System.out.println("Powierzchnia pierwszego pomieszczenia wynosi "+PomieszczeniePierwsze+" metrów kwadratowych");
        System.out.println("Powierzchnia drugiego pomieszczenia wynosi "+PomieszczenieDrugie+" metrów kwadratowych");
        System.out.println("Powierzchnia trzeciego pomieszczenia wynosi "+PomieszczenieTrzecie+" metrów kwadratowych");
        System.out.println("Powierzchnia czwartego pomieszczenia wynosi "+PomieszczenieCzwarte+" metrów kwadratowych");
        System.out.println("Powierzchnia mieszkania wynosi "+PowierzchniaMieszkania+" metrów kwadratowych");
    }
}
