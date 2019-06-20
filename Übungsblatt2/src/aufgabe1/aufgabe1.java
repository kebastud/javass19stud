package aufgabe1;

public class aufgabe1 {
    public static void main(String[] args){
        int z=9;
        int s=9;
        int inrkement;
        for(int i=1;i<=z;i++){
             inrkement = 5;
             inrkement = inrkement * i;
            for(int j=1;j<=s;j++){
                inrkement += 5;
                System.out.printf(  inrkement + " " );
            }
            System.out.printf(   "\n" );
        }
    }
}
