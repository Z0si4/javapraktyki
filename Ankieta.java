public class Ankieta {
    public static void main(String[] args){
        int Ankietowani = 12467;
        int JedenTygodniowo = (Ankietowani/100)*14;
        int Cytrusowy = (Ankietowani/100)*64;
        System.out.println("Liczba osób które kupują przynajmniej jeden napój tygodniowo:"+JedenTygodniowo);
        System.out.println("Liczba osób które preferują smak cytrusowy:"+Cytrusowy);
    }
}
