package aufgabe1;

public class aufgabe1 {
    public static void main(String[] args){
        int z=9;
        int s=9;
        int inkrement;
        for(int i=1;i<=z;i++){
            inkrement = 5;
            inkrement = inkrement * i;
            for(int j=1;j<=s;j++){
                inkrement += 5;
                System.out.printf(  inkrement + " " );
            }
            System.out.printf(   "\n" );
        }
    }
}
