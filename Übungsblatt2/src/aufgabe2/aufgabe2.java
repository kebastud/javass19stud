package aufgabe2;

import java.lang.Math;

public class aufgabe2 {
    public static void main(String[] args) {
        double min, max;
        int r = 10;
        int d;
        double[][] messwerte;
        messwerte = new double[r][2];
        for (int i = 0; i < r; i++) {
            min = Math.random() * 10;
            max = Math.random() * 20;
            if ((min >= 0 && min <= 10) || (max >= 5 && max <= 20)) {
                if (min > max) {
                    messwerte[i][0] = max;
                    messwerte[i][1] = min;
                } else {
                    messwerte[i][0] = min;
                    messwerte[i][1] = max;
                }
            }
            d=i+1;
            System.out.printf("Tag: " + d  +"\tMinimal: " + messwerte[i][0] + "\t\t\tMaximal: " + messwerte[i][1] + "\n" );
        }
    }
}
