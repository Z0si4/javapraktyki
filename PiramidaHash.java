public class PiramidaHash{
    public static void main(String[] args){
        int pietra =6;
        int hashe = 7;
        for(pietra = 0;pietra<6;pietra++){
            System.out.print("#");
            for(hashe = pietra;hashe>0;hashe--){
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.print("\n");
        }
    }
}