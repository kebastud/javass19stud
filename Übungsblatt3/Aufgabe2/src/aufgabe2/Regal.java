package aufgabe2;

public class Regal {
    float hoehe = 4000;
    float breite = 3000;
    Buch [] buecher;

    public Regal (float hoehe, float breite){
        this.breite = breite;
        this.hoehe = hoehe;
        this.buecher  = new Buch [500];
    }

    public Regal() {
        this(5000.0F, 3000.0F);
    }

    public boolean addBook(Buch buch){
        boolean done = false;
        for(int i=0;i< this.buecher.length -1;i++){
            if(this.buecher[i] == null){
                this.buecher[i] = buch;
                done = true;
            }
        }
       return done;
    }
}
