public class Akcje {
    public static void main(String[] args){
        int IloscAkcji = 600;
        double CenaAkcji = 21.77;
        double Prowizja = 0.02;
        double WartoscAkcji = IloscAkcji * CenaAkcji;
        double WysokoscProwizji = WartoscAkcji * Prowizja;
        double LacznaWartoscTransakcji = WartoscAkcji + WysokoscProwizji;
        System.out.println("Kwota zapłacona za akcje bez prowizji: "+WartoscAkcji);
        System.out.println("Wysokość prowizji: "+WysokoscProwizji);
        System.out.println("Kwota zapłacona za akcje z prowizją: "+LacznaWartoscTransakcji);
    }
}
