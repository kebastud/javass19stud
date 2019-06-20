package parkhaus;

public class Parkhaus {
    boolean schrankeOffen;
    int AnzPark;

    public Parkhaus (int platz){
        AnzPark = platz;
    }

    public boolean AutoRein(){
        if (AnzPark > 0){
            schrankeOffen = true;
        }
        if(schrankeOffen == true){
            this.AnzPark-=1;
            return true;
        }else{
            return false;
        }
    }

    public void AutoRaus(){
        this.AnzPark += 1;
    }
}

