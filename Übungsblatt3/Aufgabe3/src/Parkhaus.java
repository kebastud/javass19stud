public class Parkhaus {
    boolean schranke;
    Parkdeck[] parkdecks;
    static String name;

    public Parkhaus(int anzpd, int anzpp)
    {
        this.parkdecks = new Parkdeck[anzpd];
        for (int i = 0; i < anzpd; i++)
        {
            this.parkdecks[i] = new Parkdeck(i + 1, anzpp);
        }
        public void reinFahren() {
    }
        public void rausFahren() {
    }
}
}
