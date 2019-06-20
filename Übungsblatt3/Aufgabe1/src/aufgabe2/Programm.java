package aufgabe2;

public class Programm {
    public static void main(String []  args){
        int verkehr = 50;
        Parkhaus a = new Parkhaus(60);


        for(int i=1;i<=a.AnzPark;i++){
            System.out.printf("AnzPark: " + a.AnzPark + " Schranke: "+ a.schrankeOffen + "\n");
            System.out.printf("Auto: " + i + " fährt rein." + "\n");
            a.AutoRein();
            System.out.printf("AnzPark:" + a.AnzPark + "Schranke:"+ a.schrankeOffen + "\n"+ "\n");
        }
    }
}
