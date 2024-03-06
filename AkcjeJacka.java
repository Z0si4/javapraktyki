public class AkcjeJacka {
    public static void main(String[] args){
        int ZakupioneAkcje = 1000;
        double CenaZakupu = 32.87;
        double Prowizja = 0.02;
        double WartoscZakupu = ZakupioneAkcje*CenaZakupu;
        double ProwizjaPrzyZakupie = (WartoscZakupu)*Prowizja;
        int SprzedaneAkcje = 1000;
        double CenaSprzedazy = 33.92;
        double WartoscSprzedazy = SprzedaneAkcje*CenaSprzedazy;
        double ProwizjaPrzySprzedazy = WartoscSprzedazy*Prowizja;
        double Zysk =(WartoscSprzedazy-ProwizjaPrzySprzedazy)-(WartoscZakupu+ProwizjaPrzyZakupie);
        System.out.println("Jacek zapłacił za akcje "+WartoscZakupu+"zł");
        System.out.println("Jacek przy zakupie zapłacił brokerowi "+ProwizjaPrzyZakupie);
        System.out.println("Przy sprzedaży Jacek otrzymał: "+WartoscSprzedazy+"zł");
        System.out.println("Jacek przy sprzedaży zapłacił brokerowi "+ProwizjaPrzySprzedazy);
        System.out.println("Zysk Jacka wynosi: "+Zysk+"zł");
    }
}
