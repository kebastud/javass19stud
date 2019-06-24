package Boot;

public class Boot {
    public String name;
    public String farbe;

    public Boot(String name, String farbe){
        this.farbe = farbe;
        this.name = name;
    }

    @Override
    public Boot clone(){
        return new Boot(name,farbe);
    }

}
