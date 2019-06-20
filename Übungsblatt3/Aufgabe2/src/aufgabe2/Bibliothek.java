package aufgabe2;

import java.io.PrintStream;

public class Bibliothek {
    Regal[] regal;

    public Bibliothek(int size) {
        this.regal = new Regal[size];

        for(int i = 0; i < size; ++i) {
            this.regal[i] = new Regal(4000.0F, 3000.0F);
        }

    }

    public void addBuch(Buch buch) {
        for (int i = 0; i < this.regal.length; ++i) {
            if (this.regal[i].addBook(buch)) {
                PrintStream var10000 = System.out;
                int var10001 = buch.getNr();
                var10000.println("Buch " + var10001 + "wurde im Regal " + i + " hinzugefügt.");
                break;
            }
        }

    }
}

