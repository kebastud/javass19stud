package aufgabe5;

public class aufgabe5 {
    public static void main(String[] args){
        int j = 2000;
        if (j%4 == 0 && j% 100 ==0)
        {
            System.out.printf( j + " ist ein Schaltjahr");
        }
        else{
            System.out.printf( j + " kein ein Schaltjahr");
        }
    }
}
