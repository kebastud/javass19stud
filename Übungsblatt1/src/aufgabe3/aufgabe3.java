package aufgabe3;

public class aufgabe3 {
    public static void summe(int z) {
        float avg =0;
        int sum = 0;
        String ausgabe = "";

        for (int i = 1; i <= z; i++) {
            if (i % 10 == 0) {
                ausgabe = ausgabe +" "+ i + "\n";
            } else {
                ausgabe = ausgabe +" "+  i;
            }
            sum=sum+i;
        }
        avg= sum/z;
        ausgabe = ausgabe + "\n" + "Summe: " + sum + "\n" + "Mittwert: " + avg;
        System.out.printf(ausgabe);
    }

    public static void main(String[] args) {
        int zahl = 34;
        summe(zahl);
    }
}
