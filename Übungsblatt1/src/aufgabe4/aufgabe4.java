package aufgabe4;
import java.lang.Math;
public class aufgabe4 {

    public static String mittelwert(double a, double b, double c){
        String erg = "Mittelwert:" + (a + b + c) /3;
        return erg;
    }

    public static void main(String[] args) {
        double c = Math.random();
        double b = Math.random();
        double a= Math.random();
        String ausgabe = mittelwert(a,b,c);

        System.out.printf(ausgabe);
    }
}
