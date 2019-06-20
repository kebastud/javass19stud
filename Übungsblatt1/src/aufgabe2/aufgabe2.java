package aufgabe2;

public class aufgabe2 {
    public static void schleife(int z, int s, boolean lang) {
        String Z = "Z: ", S = "S: ";
        if (lang == true) {
            Z = "Zeile:";
            S = "Spalte:";
        }

        for (int i = 0; i <= z; i++) {
            System.out.printf("\n");
            for (int j = 0; j <= s; j++) {
                System.out.printf(Z + z + " " + S + s + " ");
            }
        }
    }

    public static void main(String[] args) {
        int zeilen = 4;
        int spalten = 3;
        boolean lang = false;
        schleife(zeilen, spalten, lang);
    }
}
