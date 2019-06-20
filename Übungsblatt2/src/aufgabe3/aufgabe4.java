package aufgabe3;

import java.lang.Math;


public class aufgabe4 {

    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;

    }

    public static void printSchale(boolean[][] schale, int h, int b, char typ, int gen){
        int j;

        if (typ == 's'){
            System.out.printf("Start-Generation"+ "\n\n");
        }else
        {
            System.out.printf("\n\n" +  gen + ". Generatation" + "\n\n");
        }

        for (int i = 0; i < h; i++) {
                for (j = 0; j < b; j++) {
                    System.out.printf(schale[i][j] ? "X": " ");
                }
            System.out.printf("\n");
        }
    }

    public static boolean[][] newGeneration(boolean[][] welle, int h, int b){
        int j;
        for (int i = 0; i < h; i++) {
            for (j = 0; j < b; j++) {
                System.out.printf(welle[i][j] ? "X": " ");
            }
            System.out.printf("\n");
        }

        return  welle;
    }

    public static void main(String[] args) {
        int j,h = 10;
        int b = 10;
        int leben = 0;
        boolean[][] schale;
        schale = new boolean[h][b];
        char typus = 's';
        int gen = 0;

        for (int i = 0; i < h; i++) {
            do {
                for (j = 0; j < b; j++) {
                    schale[i][j] = getRandomBoolean();
                    if (schale[i][j] == true) {
                        leben++;
                    }
                }
            }
            while (leben == 6);
            leben =0;
        }
        printSchale(schale,h,b,typus,gen);
        typus ='g';
        for(int generation=1;generation<=10;generation ++){
            schale = newGeneration(schale,h,b);
            printSchale(schale,h,b,typus,generation);
        }

    }

}



