public class Parkdeck {
int pdnr;
Parkplatz[] parkplaetze;



    public  Parkdeck(int pdnr,int anzpp)
{
    this.pdnr=pdnr;
    for(int i=0; i < anzpp;i++){
        this.parkplaetze[i] = new Parkplatz(i+1,anzpp);
    }
}
}

