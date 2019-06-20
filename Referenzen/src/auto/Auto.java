package auto;

public class Auto {
    String name;
    String marke;
    int geschindigkeit = 0;

    public Auto(){
        name = "NoName";
        marke = "NoName";
        geschindigkeit = 0;
    }

    void beschleunigen(int wert)
    {
        geschindigkeit += wert;
    }
}
