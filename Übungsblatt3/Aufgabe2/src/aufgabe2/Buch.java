package aufgabe2;

public class Buch {
    String titel;
    Autor autor;
    int nr;


    public Buch(Autor a, String titel){
        int counter = 0;
        this.autor = a;
        this.titel =titel;
        this.nr = ++counter;
    }
        public int getNr() {
            return this.nr;
        }

}
