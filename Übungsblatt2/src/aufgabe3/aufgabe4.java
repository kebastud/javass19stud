package aufgabe3;
import java.lang.Math;


public class aufgabe4 {
    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;

    }
    public static void main(String[] args){
        int h = 11;
        int b = 11;
        boolean[][] schale;
        schale = new boolean[h+1][b+1];

        for(int i=0;i<=h;i++){
            for(int j=0;j<=b;j++){
                schale[i][j] = getRandomBoolean();
                System.out.printf( schale[i][j] + " ");
            }
            System.out.printf("\n");
        }


    }
}
