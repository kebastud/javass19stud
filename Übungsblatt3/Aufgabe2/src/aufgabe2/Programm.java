package aufgabe2;

public class Programm {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek(4);

        for(int i = 0; i < 1000; ++i) {
            Buch buch;
            buch = new Buch(new Autor("hans", "jürgen"), "java8");
            bibliothek.addBuch(buch);
        }

    }
}
